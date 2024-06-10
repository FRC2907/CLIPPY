from google.protobuf.text_format import Parse
import protos.Log_pb2 as log_pb

def get(filepath):
	with open(filepath, 'r') as f:
		d = f.read()
	l = log_pb.Log()
	Parse(d, l)
	return l
