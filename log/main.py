import paho.mqtt.client as mq
from sys import stdout
from pathlib import Path

import logging
from logging.handlers import RotatingFileHandler

from google.protobuf.timestamp_pb2 import Timestamp
import protos.Log_pb2 as log_pb

broker, port = 'mq', 1883
log_file = '/d/CLIPPY.txtpb'

Path(log_file).parent.mkdir(parents=True, exist_ok=True)
rotator = RotatingFileHandler(log_file, mode='a', maxBytes=2**20, backupCount=100)
stdouter = logging.StreamHandler(stream=stdout)

logger = logging.getLogger('CLIPPY-mq')
logging.basicConfig(
		format='%(message)s'
		, level=logging.INFO
		)
logger.addHandler(stdouter)
logger.addHandler(rotator)

def on_connect(client, userdata, flags, reason_code, properties):
	client.subscribe('#')

l = log_pb.Log()
def on_message(client, userdata, msg):
	r = log_pb.Log.LogRecord()
	r.timestamp.GetCurrentTime()
	r.key = str(msg.topic)
	r.value = str(msg.payload.decode())
	l.records.append(r)
	logger.info(str(l))
	del l.records[:]

mqc = mq.Client(mq.CallbackAPIVersion.VERSION2)
mqc.on_connect = on_connect
mqc.on_message = on_message

mqc.connect(broker, port, 60)

mqc.loop_forever()
