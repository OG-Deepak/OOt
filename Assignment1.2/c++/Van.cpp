#include <iostream>
#include "Van.h"

using namespace std;

Van::Van(int vehicleId, string vehicleNumber, int capacity, double loadCapacity)
    : Vehicle(vehicleId, vehicleNumber, capacity)
{
    this->loadCapacity = loadCapacity;
}

// Displays van details
void Van::displayVehicleDetails()
{
    cout << "\n----------- Van Details -----------" << endl;
    cout << "Vehicle ID : " << vehicleId << endl;
    cout << "Vehicle Number : " << vehicleNumber << endl;
    cout << "Capacity : " << capacity << endl;
    cout << "Load Capacity : " << loadCapacity << " kg" << endl;
}