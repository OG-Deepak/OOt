# ==========================================
# 1. THE BLUEPRINT (Classes and Objects)
# ==========================================

class Animal:
    """This is a parent class (blueprint) for all animals."""
    
    # The Constructor: This runs automatically when you create a new animal
    def __init__(self, name, age):
        self.name = name          # Public variable: anyone can see it
        self.age = age            # Public variable: anyone can see it
        
        # ==========================================
        # 2. ENCAPSULATION (Hiding Data)
        # ==========================================
        # We use a double underscore (__) to hide sensitive data
        self.__health = 100       # Private variable: locked inside this class

    # A standard method (action) that the object can do
    def speak(self):
        return f"{self.name} makes a noise."

    # Getter method: A safe window to view the private health variable
    def get_health(self):
        return self.__health

    # Setter method: A safe way to change private health, with rules
    def take_damage(self, amount):
        self.__health -= amount
        if self.__health < 0:
            self.__health = 0


# ==========================================
# 3. INHERITANCE (Parent and Child)
# ==========================================

# Dog is a child class. It inherits everything from Animal.
class Dog(Animal):
    def __init__(self, name, age, breed):
        # super() calls the parent class constructor to set name and age
        super().__init__(name, age)
        self.breed = breed        # Unique variable just for Dogs

    # ==========================================
    # 4. POLYMORPHISM (Changing Behavior)
    # ==========================================
    # We change the 'speak' action specifically for dogs (Method Overriding)
    def speak(self):
        return f"{self.name} says Woof!"


# Cat is another child class that inherits from Animal
class Cat(Animal):
    # Cats don't need a unique constructor, they just use Animal's constructor
    
    # Changing the 'speak' action specifically for cats
    def speak(self):
        return f"{self.name} says Meow!"


# ==========================================
# CODE EXECUTION (Testing everything)
# ==========================================
if __name__ == "__main__":
    print("--- 1. Testing Objects ---")
    # Creating individual objects from our blueprints
    buddy = Dog("Buddy", 3, "Golden Retriever")
    whiskers = Cat("Whiskers", 5)

    print(f"Dog Name: {buddy.name}, Breed: {buddy.breed}")
    print(f"Cat Name: {whiskers.name}, Age: {whiskers.age}")

    print("\n--- 2. Testing Polymorphism ---")
    # Both objects use the same method name, but act differently!
    print(buddy.speak())      # Outputs: Buddy says Woof!
    print(whiskers.speak())  # Outputs: Whiskers says Meow!

    print("\n--- 3. Testing Encapsulation ---")
    # Trying to print private health directly will crash the program:
    # print(buddy.__health) # <-- ERROR! Python hides this.
    
    # Instead, we use the safe getter method
    print(f"Buddy's starting health: {buddy.get_health()}%")
    
    # We change health safely using the setter method
    buddy.take_damage(30)
    print(f"Buddy's health after a scrape: {buddy.get_health()}%")
