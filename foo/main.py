import paho.mqtt.client as mq

def on_connect(client, userdata, flags, reason_code, properties):
	client.subscribe("#")

def on_message(client, userdata, msg):
	print(msg.topic + " " + str(msg.payload))

mqc = mq.Client(mq.CallbackAPIVersion.VERSION2)
mqc.on_connect = on_connect
mqc.on_message = on_message

mqc.connect("mq", 1883, 60)

mqc.loop_forever()
