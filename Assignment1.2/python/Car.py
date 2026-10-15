# Inheritance
# Car class inherits properties like vehicleId, vehicleNumber,
# and capacity from the Vehicle class.

from Vehicle import Vehicle


class Car(Vehicle):

    # Car class has its own property as automatic
    def __init__(self, vehicleId, vehicleNumber, capacity, automatic):
        super().__init__(vehicleId, vehicleNumber, capacity)
        self.__automatic = automatic

    # Method overriding
    def displayVehicleDetails(self):

        print("\n----------- Car Details -----------")
        print("Vehicle ID :", self.vehicleId)
        print("Vehicle Number :", self.vehicleNumber)
        print("Capacity :", self.capacity)
        print("Automatic :", self.__automatic)