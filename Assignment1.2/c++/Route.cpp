#include <iostream>
#include "Route.h"

using namespace std;

Route::Route(int routeId, string source, string destination,double distance, string estimatedTime)
{
    this->routeId = routeId;
    this->source = source;
    this->destination = destination;
    this->distance = distance;
    this->estimatedTime = estimatedTime;
}

// Displays route details including ID, source, destination,
// distance, and estimated time
void Route::displayRouteDetails()
{
    cout << "\n----------- Route Details -----------" << endl;
    cout << "Route ID : " << routeId << endl;
    cout << "Source : " << source << endl;
    cout << "Destination : " << destination << endl;
    cout << "Distance : " << distance << " km" << endl;
    cout << "Estimated Time : " << estimatedTime << endl;
}