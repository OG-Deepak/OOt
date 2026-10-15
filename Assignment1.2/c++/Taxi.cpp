#include <iostream>
#include "Taxi.h"

using namespace std;

Taxi::Taxi(int vehicleId, string vehicleNumber, int capacity, string driverName)
    : Vehicle(vehicleId, vehicleNumber, capacity)
{
    this->driverName = driverName;
}

void Taxi::displayVehicleDetails()
{
    cout << "\n----------- Taxi Details -----------" << endl;
    cout << "Vehicle ID : " << vehicleId << endl;
    cout << "Vehicle Number : " << vehicleNumber << endl;
    cout << "Capacity : " << capacity << endl;
    cout << "Driver Name : " << driverName << endl;
}