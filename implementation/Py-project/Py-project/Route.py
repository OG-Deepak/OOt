class Route:
  def __init__(self,Id, source,destination,distance):
    self.__Id=Id
    self.__source=source
    self.__destination=destination
    self.__distance=distance

  def setName(self ,Id):
      self.__Id=Id

  def getName(self):
     return self.__Id

  def setPhone(self ,source):
      self.__source

  def getPhone(self):
     return self.__source

  def getId(self):
     return self.__destination

  def setId(self ,Id):
      self.__destination

  def getEmail(self):
     return self.__distance

  def setEmail(self ,distance):
      self.__distance

  def view(self):
    print("Id:",self.__Id)
    print("source:",self.__source)
    print("destination:",self.__destination)  
    print("distance:",self.__distance)