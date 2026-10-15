#ifndef ROUTE_H
#define ROUTE_H

#include <string>
using namespace std;

class Route
{
private:
    int routeId;
    string source;
    string destination;
    double distance;
    string estimatedTime;

public:
    Route(int routeId, string source, string destination,
        double distance, string estimatedTime);

    void displayRouteDetails();
};

#endif