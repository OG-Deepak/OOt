# Inheritance
# Taxi class inherits properties like vehicleId, vehicleNumber,
# and capacity from the Vehicle class.

from Vehicle import Vehicle


class Taxi(Vehicle):

    # Taxi class has its own property as driverName
    def __init__(self, vehicleId, vehicleNumber, capacity, driverName):
        super().__init__(vehicleId, vehicleNumber, capacity)
        self.__driverName = driverName

    # Method overriding
    def displayVehicleDetails(self):

        print("\n----------- Taxi Details -----------")
        print("Vehicle ID :", self.vehicleId)
        print("Vehicle Number :", self.vehicleNumber)
        print("Capacity :", self.capacity)
        print("Driver Name :", self.__driverName)