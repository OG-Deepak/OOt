#ifndef BIKE_H
#define BIKE_H

#include "Vehicle.h"

class Bike : public Vehicle
{
private:
    bool helmetAvailable;

public:
    Bike(int vehicleId, string vehicleNumber, int capacity, bool helmetAvailable);

    void displayVehicleDetails() override;
};

#endif