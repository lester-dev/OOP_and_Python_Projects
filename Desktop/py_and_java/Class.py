class Vehicle:
    def __init__(self, brand, fuel):
        self.brand = brand
        self.fuel = fuel

class Car(Vehicle):
    def __init__(self, brand, fuel, doors):
        Vehicle.__init__(self, brand, fuel)
        self.doors = doors

    # Now the drive method is part of the Car class
    def drive(self, distance):
        fuel_consumption = 0.1 * distance
        if self.fuel >= fuel_consumption:
            self.fuel -= fuel_consumption
            print(f"{self.brand} drove {distance} km. Remaining fuel: {self.fuel} liters.")
        else:
            print(f"{self.brand} does not have enough fuel to drive the distance.")

# Create an instance of Car
my_car = Car(brand="Toyota", fuel=50, doors=4)

# Call the drive method
my_car.drive(200)
my_car.drive(500)

# Print the remaining fuel
print(f"{my_car.brand} remaining fuel: {my_car.fuel} liters.")
