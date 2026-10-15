class Route:

    def __init__(self, routeId, source, destination, distance, estimatedTime):
        self.__routeId = routeId
        self.__source = source
        self.__destination = destination
        self.__distance = distance
        self.__estimatedTime = estimatedTime

    # Displays route details including ID, source, destination,
    # distance, and estimated time
    def displayRouteDetails(self):

        print("\n----------- Route Details -----------")
        print("Route ID :", self.__routeId)
        print("Source :", self.__source)
        print("Destination :", self.__destination)
        print("Distance :", self.__distance, "km")
        print("Estimated Time :", self.__estimatedTime)