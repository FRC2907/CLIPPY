#!/usr/bin/env python

# https://github.com/grpc/grpc/blob/master/examples/python/helloworld/greeter_server.py

import sys
sys.path.append("./protos")

import grpc

from protos.WaypointShufflers_pb2_grpc import WaypointEaterStub as WaypointEater

from gen import gen

def main():
    print("Hello, world!")
    with grpc.insecure_channel("localhost:5800") as channel:
        stub = WaypointEater(channel)
        for pt in gen():
            stub.IngestWaypoint(pt)


if __name__ == "__main__":
    main()
