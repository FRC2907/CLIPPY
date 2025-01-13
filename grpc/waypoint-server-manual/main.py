#!/usr/bin/env python

# https://github.com/grpc/grpc/blob/master/examples/python/helloworld/greeter_server.py

import sys
sys.path.append("./protos")

from concurrent import futures

import grpc
from protos.Waypoint_pb2 import Waypoint, WaypointType
from protos.WaypointShufflers_pb2_grpc import WaypointServerServicer as IWaypointServer, add_WaypointServerServicer_to_server as addWaypointServer
from google.protobuf.empty_pb2 import Empty
from google.protobuf.timestamp_pb2 import Timestamp
from random import randint

class WaypointServer(IWaypointServer):
    def GetWaypoints(self, q, ctx):
        for t in [
            WaypointType.NEUTRAL
            , WaypointType.FREE
            , WaypointType.OBSTACLE
            , WaypointType.SELF
            , WaypointType.UNKNOWN
            , WaypointType.TARGET
        ]:
            w = Waypoint()
            w.x = randint(0, 640)
            w.y = randint(0, 400)
            w.t_xy = randint(0, 360)
            w.waypoint_type = t
            if t == WaypointType.SELF:
                w.dx = 14
                w.dy = 14
            else:
                w.dx = randint(10, 30)
                w.dy = randint(10, 30)
            yield w

def main():
    print("Hello, world!")
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    addWaypointServer(WaypointServer(), server)
    server.add_insecure_port("127.0.0.1:50051")
    server.start()
    server.wait_for_termination()

if __name__ == "__main__":
    main()
