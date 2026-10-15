#ifndef CAR_H
#define CAR_H

#include "Vehicle.h"

class Car : public Vehicle
{
private:
    bool automatic;

public:
    Car(int vehicleId, string vehicleNumber, int capacity, bool automatic);

    void displayVehicleDetails() override;
};

#endif