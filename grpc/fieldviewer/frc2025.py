import sys
sys.path.append("./protos")

from math import sqrt, cos, sin, tan, atan2, radians, degrees

from protos.Waypoint_pb2 import Waypoint, WaypointType

def buildObstacle(x, y, dx, dy, t_xy = 0):
    out = Waypoint()
    out.x = x
    out.y = y
    out.dx = dx
    out.dy = dy
    out.t_xy = t_xy
    out.waypoint_type = WaypointType.OBSTACLE
    return out

def buildTarget(x, y, dx, dy, t_xy):
    out = Waypoint()
    out.x = x
    out.y = y
    out.dx = dx
    out.dy = dy
    out.t_xy = t_xy
    out.waypoint_type = WaypointType.TARGET
    return out

def wrap180(deg):
    while deg > 180:
        deg -= 360
    while deg < -180:
        deg += 360
    return deg

def reflect_x(pt: Waypoint):
    out = Waypoint()
    out.CopyFrom(pt)
    out.x = red_wall - pt.x
    out.t_xy = 180 - wrap180(pt.t_xy) # ??
    return out

def reflect_y(pt: Waypoint):
    out = Waypoint()
    out.CopyFrom(pt)
    out.y = audience_wall - pt.y
    out.t_xy = 180 - wrap180(pt.t_xy) # ??
    return out

# https://stackoverflow.com/a/34374437/6627273
def rotate(pt: Waypoint, axis: Waypoint, dt):
    out = Waypoint()
    out.CopyFrom(pt)
    ox, oy = axis.x, axis.y
    px, py = out.x, out.y
    qx = ox + cos(radians(dt)) * (px - ox) - sin(radians(dt)) * (py - oy)
    qy = oy + sin(radians(dt)) * (px - ox) + cos(radians(dt)) * (py - oy)
    out.x = qx
    out.y = qy
    out.t_xy = wrap180(dt + pt.t_xy) # ??
    return out

def patternRotate(pt: Waypoint, axis: Waypoint, count):
    out = []
    for dt in range(0, 360, int(360/count)):
        out.append(rotate(pt, axis, dt))
    return out

def translate(pt: Waypoint, dx, dy):
    out = Waypoint()
    out.CopyFrom(pt)
    out.x += dx
    out.y += dy
    return out

def patternTranslate(pt: Waypoint, dx, dy, count):
    out = []
    for i in range(count):
        out.append(translate(pt, dx * i, dy * i))
    return out

def patternTranslateSymmetric(pt: Waypoint, dx, dy, count_each):
    return patternTranslate(translate(pt, -dx * count_each, -dy * count_each), dx, dy, 1 + count_each * 2)

def revolve180(pt: Waypoint):
    return rotate(pt, center, 180)







FieldObstacles = []
FieldTargets = []

# x
blue_wall = 0
midline_hamburger = (481.39 + 209.49) / 2 # from april tags
red_wall = midline_hamburger * 2

# y
scoring_wall = 0
midline_hotdog = 158.5 # from april tags
audience_wall = midline_hotdog * 2

center = Waypoint()
center.x = midline_hamburger
center.y = midline_hotdog
center.waypoint_type = WaypointType.NEUTRAL


field_x = int(red_wall)
field_y = int(audience_wall)

coral_station_x = 144 - 14 + 93.5/2
coral_station_diameter = 93.5 - (14*2)
coral_station = buildObstacle(coral_station_x, midline_hotdog, coral_station_diameter, coral_station_diameter)

FieldObstacles.append(coral_station)
FieldObstacles.append(reflect_x(coral_station))
# center field tower
FieldObstacles.append(buildObstacle(midline_hamburger, midline_hotdog, (midline_hotdog - 146.5)*2,  (midline_hotdog - 146.5)*2))

reef = buildTarget(144 - 7, midline_hotdog, 14, 12, 0)
FieldTargets.append(reef)
reefs = patternRotate(reef, coral_station, 6)
for r in reefs:
    FieldTargets.append(r)
    FieldTargets.append(reflect_x(r))

starting_corals = patternTranslateSymmetric(buildTarget(48, midline_hotdog, 4, 4, 0), 0, 72, 1)
for c in starting_corals:
    for a in [c, revolve180(c)]:
        FieldTargets.append(a)

barge = buildTarget(midline_hamburger, 146.5/2, 46, 146.5, 180)
FieldTargets.append(barge)
FieldTargets.append(revolve180(barge))

proc = buildTarget(coral_station_x + coral_station_diameter/2 + 88 - 61.76, scoring_wall, 15, 25, -90) # approx
FieldTargets.append(proc)
FieldTargets.append(revolve180(proc))