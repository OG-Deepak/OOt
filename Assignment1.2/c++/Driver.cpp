#include <iostream>
#include "Driver.h"

using namespace std;

Driver::Driver(int driverId, string driverName, string phoneNumber,string licenseNumber, int experience,string availabilityStatus)
{
    this->driverId = driverId;
    this->driverName = driverName;
    this->phoneNumber = phoneNumber;
    this->licenseNumber = licenseNumber;
    this->experience = experience;
    this->availabilityStatus = availabilityStatus;
}

void Driver::displayDriverDetails()
{
    cout << "\n----------- Driver Details -----------" << endl;
    cout << "Driver ID : " << driverId << endl;
    cout << "Driver Name : " << driverName << endl;
    cout << "Phone Number : " << phoneNumber << endl;
    cout << "License Number : " << licenseNumber << endl;
    cout << "Experience : " << experience << " Years" << endl;
    cout << "Availability : " << availabilityStatus << endl;
}