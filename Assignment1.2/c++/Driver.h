#ifndef DRIVER_H
#define DRIVER_H

#include <string>
using namespace std;

class Driver
{
private:
    int driverId;
    string driverName;
    string phoneNumber;
    string licenseNumber;
    int experience;
    string availabilityStatus;

public:
    Driver(int driverId, string driverName, string phoneNumber,
        string licenseNumber, int experience,
        string availabilityStatus);

    void displayDriverDetails();
};

#endif