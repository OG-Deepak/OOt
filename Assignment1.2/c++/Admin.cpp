#include <iostream>
#include "Admin.h"

using namespace std;

Admin::Admin(int adminId, string adminName, string password)
{
    this->adminId = adminId;
    this->adminName = adminName;
    this->password = password;
}

void Admin::displayAdminDetails()
{
    cout << "\n----------- Admin Details -----------" << endl;
    cout << "Admin ID : " << adminId << endl;
    cout << "Admin Name : " << adminName << endl;
}