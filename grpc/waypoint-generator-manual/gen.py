import sys
sys.path.append("./protos")

from protos.Waypoint_pb2 import Waypoint, WaypointType
from random import randint

def gen():
    out = []
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
        out.append(w)
    return out