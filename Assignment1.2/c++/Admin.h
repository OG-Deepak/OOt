#ifndef ADMIN_H
#define ADMIN_H

#include <string>
using namespace std;

class Admin
{
private:
    int adminId;
    string adminName;
    string password;

public:
    Admin(int adminId, string adminName, string password);

    void displayAdminDetails();
};

#endif