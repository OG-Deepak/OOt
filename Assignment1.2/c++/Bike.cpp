#include <iostream>
#include "Bike.h"

using namespace std;

Bike::Bike(int vehicleId, string vehicleNumber, int capacity, bool helmetAvailable)
    : Vehicle(vehicleId, vehicleNumber, capacity)
{
    this->helmetAvailable = helmetAvailable;
}

void Bike::displayVehicleDetails()
{
    cout << "\n----------- Bike Details -----------" << endl;
    cout << "Vehicle ID : " << vehicleId << endl;
    cout << "Vehicle Number : " << vehicleNumber << endl;
    cout << "Capacity : " << capacity << endl;
    cout << "Helmet Available : " << helmetAvailable << endl;
}