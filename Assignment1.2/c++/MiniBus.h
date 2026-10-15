#ifndef MINIBUS_H
#define MINIBUS_H

#include "Vehicle.h"

class MiniBus : public Vehicle
{
private:
    bool ac;

public:
    MiniBus(int vehicleId, string vehicleNumber, int capacity, bool ac);

    void displayVehicleDetails() override;
};

#endif