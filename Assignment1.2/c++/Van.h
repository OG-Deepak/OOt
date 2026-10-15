#ifndef VAN_H
#define VAN_H

#include "Vehicle.h"

class Van : public Vehicle
{
private:
    double loadCapacity;

public:
    Van(int vehicleId, string vehicleNumber, int capacity, double loadCapacity);

    void displayVehicleDetails() override;
};

#endif