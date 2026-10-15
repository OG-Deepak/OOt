# Abstract Parent Class

from abc import ABC, abstractmethod


class Vehicle(ABC):
#ABC → allows us to create an Abstract Base Class.
#abstractmethod → marks a method as abstract.
    def __init__(self, vehicleId, vehicleNumber, capacity):  #constructor
        self.vehicleId = vehicleId   #self means: the current object
        self.vehicleNumber = vehicleNumber
        self.capacity = capacity

    @abstractmethod
    def displayVehicleDetails(self):
        pass
