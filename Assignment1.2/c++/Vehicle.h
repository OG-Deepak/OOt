#ifndef VEHICLE_H
#define VEHICLE_H

#include <string>
using namespace std;

// Abstract Parent Class
class Vehicle
{
protected:
    int vehicleId;
    string vehicleNumber;
    int capacity;

public:
    Vehicle(int vehicleId, string vehicleNumber, int capacity);

    virtual void displayVehicleDetails() = 0;

    virtual ~Vehicle() = default;
};

#endif