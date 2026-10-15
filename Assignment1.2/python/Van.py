# Inheritance
# Van class inherits properties like vehicleId, vehicleNumber,
# and capacity from the Vehicle class.

from Vehicle import Vehicle


class Van(Vehicle):

    # Van class has its own property as loadCapacity
    def __init__(self, vehicleId, vehicleNumber, capacity, loadCapacity):
        super().__init__(vehicleId, vehicleNumber, capacity)
        self.__loadCapacity = loadCapacity

    # Method overriding
    # Displays van details
    def displayVehicleDetails(self):

        print("\n----------- Van Details -----------")
        print("Vehicle ID :", self.vehicleId)
        print("Vehicle Number :", self.vehicleNumber)
        print("Capacity :", self.capacity)
        print("Load Capacity :", self.__loadCapacity, "kg")