#!/usr/bin/env python

# https://github.com/grpc/grpc/blob/master/examples/python/helloworld/greeter_server.py

import sys
sys.path.append("./protos")

import grpc

from protos.Waypoint_pb2 import Waypoint, WaypointType
from protos.WaypointShufflers_pb2_grpc import WaypointEaterStub as WaypointSender
from google.protobuf.empty_pb2 import Empty

from gen import gen

def main():
    print("Hello, world!")
    with grpc.insecure_channel("localhost:5800") as channel:
        stub = WaypointSender(channel)
        for pt in gen():
            stub.IngestWaypoint(pt)


if __name__ == "__main__":
    main()
