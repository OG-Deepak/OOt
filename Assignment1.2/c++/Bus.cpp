#include <iostream>
#include "Bus.h"

using namespace std;

Bus::Bus(int vehicleId, string vehicleNumber, int capacity, bool chargingPort)
    : Vehicle(vehicleId, vehicleNumber, capacity)
{
    this->chargingPort = chargingPort;
}

void Bus::displayVehicleDetails()
{
    cout << "\n----------- Bus Details -----------" << endl;
    cout << "Vehicle ID : " << vehicleId << endl;
    cout << "Vehicle Number : " << vehicleNumber << endl;
    cout << "Capacity : " << capacity << endl;
    cout << "Charging Port : " << chargingPort << endl;
}