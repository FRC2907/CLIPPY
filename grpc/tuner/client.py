#!/usr/bin/env python

# https://github.com/grpc/grpc/blob/master/examples/python/helloworld/greeter_server.py

import sys
sys.path.append("./protos")

from matplotlib import pyplot as plt
from matplotlib.animation import FuncAnimation
import numpy as np

import grpc

from protos.SystemTuner_pb2_grpc import SystemDataServerStub as SysData
from protos.SystemState_pb2 import SystemIDs, SystemTags, SystemState


state_generator = lambda: None
coefficients = ()


def main():
    print("Hello, world!")

    velocities, voltages = [0], [0]
    fit = lambda x: 0
    fig = plt.figure()
    scatter, line = plt.plot(
          velocities, voltages, "o"
        , velocities, fit(velocities), '--k'
        )

    # https://stackoverflow.com/a/47989314/6627273
    # https://stackoverflow.com/questions/4741243/how-to-pick-just-one-item-from-a-generator
    def update(frame):
        global coefficients
        state = next(state_generator)
        velocities.append(state.state.velocity)
        voltages.append(state.state.voltage)
        coefficients = np.polyfit(velocities, voltages, 1)
        fit = np.poly1d(coefficients)
        scatter.set_data(velocities, voltages)
        line.set_data(velocities, fit(velocities))
        fig.gca().relim()
        fig.gca().autoscale_view()
        return line



    with grpc.insecure_channel("localhost:5800") as channel:
        stub = SysData(channel)
        ids = SystemIDs()
        ids.system_ids.append(stub.GetSystemIDs(SystemTags()).system_ids[0])

        state_generator = stub.GetSystemData(ids)
        anim = FuncAnimation(fig, update, interval = 20)
        plt.show()
        print(coefficients)



if __name__ == "__main__":
    main()
