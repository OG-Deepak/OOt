#ifndef BUS_H
#define BUS_H

#include "Vehicle.h"

class Bus : public Vehicle
{
private:
    bool chargingPort;

public:
    Bus(int vehicleId, string vehicleNumber, int capacity, bool chargingPort);

    void displayVehicleDetails() override;
};

#endif