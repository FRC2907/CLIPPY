#!/usr/bin/env python

# https://github.com/grpc/grpc/blob/master/examples/python/helloworld/greeter_server.py

import sys
sys.path.append("./protos")

import grpc
import protos.Nada_pb2
import protos.DoNothing_pb2
import protos.DoNothing_pb2_grpc

def main():
    print("Hello, world!")
    with grpc.insecure_channel("localhost:50051") as channel:
        stub = protos.DoNothing_pb2_grpc.DoNothingStub(channel)
        _ = stub.Nop(protos.Nada_pb2.Nada())

if __name__ == "__main__":
    main()
