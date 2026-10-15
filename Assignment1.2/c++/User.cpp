#include <iostream>
#include "User.h"

using namespace std;

User::User(int userId, string userName, string emailId,string contactNumber, string password)
{
    this->userId = userId;
    this->userName = userName;
    this->emailId = emailId;
    this->contactNumber = contactNumber;
    this->password = password;
}

void User::displayUserDetails()
{
    cout << "\n----------- User Details -----------" << endl;
    cout << "User ID : " << userId << endl;
    cout << "User Name : " << userName << endl;
    cout << "Email ID : " << emailId << endl;
    cout << "Contact Number : " << contactNumber << endl;
}