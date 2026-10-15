#ifndef TAXI_H
#define TAXI_H

#include "Vehicle.h"

class Taxi : public Vehicle
{
private:
    string driverName;

public:
    Taxi(int vehicleId, string vehicleNumber, int capacity, string driverName);

    void displayVehicleDetails() override;
};

#endif