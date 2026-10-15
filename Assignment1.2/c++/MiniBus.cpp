#include <iostream>
#include "MiniBus.h"

using namespace std;

MiniBus::MiniBus(int vehicleId, string vehicleNumber, int capacity, bool ac)
    : Vehicle(vehicleId, vehicleNumber, capacity)
{
    this->ac = ac;
}

void MiniBus::displayVehicleDetails()
{
    cout << "\n----------- MiniBus Details -----------" << endl;
    cout << "Vehicle ID : " << vehicleId << endl;
    cout << "Vehicle Number : " << vehicleNumber << endl;
    cout << "Capacity : " << capacity << endl;
    cout << "AC Available : " << ac << endl;
}