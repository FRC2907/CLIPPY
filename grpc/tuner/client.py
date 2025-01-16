#!/usr/bin/env python

# https://github.com/grpc/grpc/blob/master/examples/python/helloworld/greeter_server.py

import sys
sys.path.append("./protos")

import grpc

from protos.SystemTuner_pb2_grpc import SystemDataServerStub as SysData
from protos.SystemState_pb2 import SystemIDs, SystemTags, SystemState

def main():
    print("Hello, world!")
    with grpc.insecure_channel("localhost:5800") as channel:
        stub = SysData(channel)
        id = stub.GetSystemIDs(SystemTags()).system_ids[0]
        ids = SystemIDs()
        ids.system_ids.append(id)
        for state in stub.GetSystemData(ids):
            print(state)


if __name__ == "__main__":
    main()
