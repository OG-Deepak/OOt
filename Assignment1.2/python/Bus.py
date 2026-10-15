# Inheritance
# Bus class inherits properties like vehicleId, vehicleNumber,
# and capacity from the Vehicle class.

from Vehicle import Vehicle

#Bus is a child class of Vehicle
class Bus(Vehicle):   

    # Bus class has its own property as a charging port
    def __init__(self, vehicleId, vehicleNumber, capacity, chargingPort):
        #super() refers to the parent class.
        super().__init__(vehicleId, vehicleNumber, capacity)
        self.__chargingPort = chargingPort  #bus has its own property

    # Method overriding
    def displayVehicleDetails(self):

        print("\n----------- Bus Details -----------")
        print("Vehicle ID :", self.vehicleId)
        print("Vehicle Number :", self.vehicleNumber)
        print("Capacity :", self.capacity)
        print("Charging Port :", self.__chargingPort)
