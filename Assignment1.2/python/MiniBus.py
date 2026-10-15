# Inheritance
# MiniBus class inherits properties like vehicleId, vehicleNumber,
# and capacity from the Vehicle class.

from Vehicle import Vehicle


class MiniBus(Vehicle):

    # MiniBus class has its own property as AC
    def __init__(self, vehicleId, vehicleNumber, capacity, ac):
        super().__init__(vehicleId, vehicleNumber, capacity)
        self.__ac = ac

    # Method overriding
    def displayVehicleDetails(self):

        print("\n----------- MiniBus Details -----------")
        print("Vehicle ID :", self.vehicleId)
        print("Vehicle Number :", self.vehicleNumber)
        print("Capacity :", self.capacity)
        print("AC Available :", self.__ac)