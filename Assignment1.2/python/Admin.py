class Admin:

    def __init__(self, adminId, adminName, password):
        self.__adminId = adminId
        self.__adminName = adminName
        self.__password = password

    def displayAdminDetails(self):

        print("\n----------- Admin Details -----------")
        print("Admin ID :", self.__adminId)
        print("Admin Name :", self.__adminName)