#ifndef USER_H
#define USER_H

#include <string>
using namespace std;

class User
{
private:
    int userId;
    string userName;
    string emailId;
    string contactNumber;
    string password;

public:
    User(int userId, string userName, string emailId,
        string contactNumber, string password);

    void displayUserDetails();
};

#endif