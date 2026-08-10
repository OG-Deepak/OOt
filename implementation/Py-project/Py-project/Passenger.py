class Passenger:
  def __init__(self,Id, name,phone,email):
    self.__Id=Id
    self.__name = name
    self.__phone = phone
    self.__email = email

  def setName(self ,name):
      self.__name=name

  def getName(self):
     return self.__name

  def setPhone(self ,phone):
      self.__phone

  def getPhone(self):
     return self.__phone

  def getId(self):
     return self.__Id

  def setId(self ,Id):
      self.__Id

  def getEmail(self):
     return self.__email

  def setEmail(self ,email):
      self.__email

  def view(self):
    print("name:",self.__name)
    print("phone:",self.__phone)
    print("email:",self.__email)  