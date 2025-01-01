#!/usr/bin/env python

# https://github.com/grpc/grpc/blob/master/examples/python/helloworld/greeter_server.py

import sys
sys.path.append("./protos")

from concurrent import futures

import grpc
import protos.Nada_pb2
import protos.DoNothing_pb2
import protos.DoNothing_pb2_grpc
import google.protobuf.empty_pb2

class DoNothing(protos.DoNothing_pb2_grpc.DoNothingServicer):
    def Nop(self, q, ctx):
        print("mrow!")
        return google.protobuf.empty_pb2.Empty()

def main():
    print("Hello, world!")
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    protos.DoNothing_pb2_grpc.add_DoNothingServicer_to_server(DoNothing(), server)
    server.add_insecure_port("127.0.0.1:50051")
    server.start()
    server.wait_for_termination()

if __name__ == "__main__":
    main()
