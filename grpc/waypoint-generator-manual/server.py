#!/usr/bin/env python

# https://github.com/grpc/grpc/blob/master/examples/python/helloworld/greeter_server.py

import sys
sys.path.append("./protos")

from concurrent import futures

import grpc
from protos.WaypointShufflers_pb2_grpc import WaypointServerServicer as IWaypointServer, add_WaypointServerServicer_to_server as addWaypointServer

from gen import gen

class WaypointServer(IWaypointServer):
    def GetWaypoints(self, q, ctx):
        for pt in gen():
            yield pt

def main():
    print("Hello, world!")
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    addWaypointServer(WaypointServer(), server)
    server.add_insecure_port("127.0.0.1:50051")
    server.start()
    server.wait_for_termination()

if __name__ == "__main__":
    main()
