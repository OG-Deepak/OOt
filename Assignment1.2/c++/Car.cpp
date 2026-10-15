#include <iostream>
#include "Car.h"

using namespace std;

Car::Car(int vehicleId, string vehicleNumber, int capacity, bool automatic)
    : Vehicle(vehicleId, vehicleNumber, capacity)
{
    this->automatic = automatic;
}

void Car::displayVehicleDetails()
{
    cout << "\n----------- Car Details -----------" << endl;
    cout << "Vehicle ID : " << vehicleId << endl;
    cout << "Vehicle Number : " << vehicleNumber << endl;
    cout << "Capacity : " << capacity << endl;
    cout << "Automatic : " << automatic << endl;
}