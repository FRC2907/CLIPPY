#!/usr/bin/env python

# https://github.com/grpc/grpc/blob/master/examples/python/helloworld/greeter_server.py

import sys
sys.path.append("./protos")

import grpc

from protos.Waypoint_pb2 import Waypoint, WaypointType
from protos.WaypointShufflers_pb2_grpc import WaypointServerStub as WaypointClient
from google.protobuf.empty_pb2 import Empty

from frc2025 import field_x, field_y, FieldObstacles, FieldTargets

import numpy as np
import cv2
from math import sin, cos, radians

colors = {
      WaypointType.UNKNOWN: (50, 50, 50) # grey
    , WaypointType.NEUTRAL: (0, 0, 255) # blue
    , WaypointType.SELF: (255, 128, 0) # orange
    , WaypointType.FREE: (127, 255, 127) # light green
    , WaypointType.TARGET: (0, 255, 0) # green
    , WaypointType.OBSTACLE: (255, 0, 0) # red
}

def applyWaypoint(field: cv2.UMat, pt: Waypoint):
    cv2.ellipse(field, cv2.RotatedRect((pt.x, pt.y), (pt.dx, pt.dy), pt.t_xy), colors[pt.waypoint_type], 2)
    cv2.line(field, (int(pt.x), int(pt.y)), (int(pt.x + 10*cos(radians(pt.t_xy))), int(pt.y + 10*sin(radians(pt.t_xy)))), colors[pt.waypoint_type], 1)

def applyWaypoints(field: cv2.UMat, pts: Waypoint):
    for pt in pts:
        applyWaypoint(field, pt)

def genField(pts = []):
    out = np.zeros((field_y, field_x, 3), dtype = 'uint8')
    applyWaypoints(out, pts)
    return out


def main():
    print("Hello, world!")
    cv2.imshow('Field Viewer', genField())
    with grpc.insecure_channel("localhost:50051") as channel:
        stub = WaypointClient(channel)
        field = genField(FieldObstacles)
        applyWaypoints(field, FieldTargets)
        for pt in stub.GetWaypoints(Empty()):
            print(pt)
            applyWaypoint(field, pt)
            cv2.imshow('Field Viewer', cv2.flip(cv2.cvtColor(field, cv2.COLOR_BGR2RGB), 0)) # flip hotdog
    cv2.waitKey(0)


if __name__ == "__main__":
    main()
