class Driver:

    def __init__(
        self,
        driverId,
        driverName,
        phoneNumber,
        licenseNumber,
        experience,
        availabilityStatus
    ):
        self.__driverId = driverId
        self.__driverName = driverName
        self.__phoneNumber = phoneNumber
        self.__licenseNumber = licenseNumber
        self.__experience = experience
        self.__availabilityStatus = availabilityStatus

    def displayDriverDetails(self):

        print("\n----------- Driver Details -----------")
        print("Driver ID :", self.__driverId)
        print("Driver Name :", self.__driverName)
        print("Phone Number :", self.__phoneNumber)
        print("License Number :", self.__licenseNumber)
        print("Experience :", self.__experience, "Years")
        print("Availability :", self.__availabilityStatus)