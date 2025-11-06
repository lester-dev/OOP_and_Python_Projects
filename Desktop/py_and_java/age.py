class Person:
    def __init__(self, age):
        self._age = None
        self.age = age  # This will call the setter

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, value):
        if isinstance(value, int) and value > 0:
            self._age = value
        else:
            raise ValueError("Age must be a positive integer.")

# Example usage of the Person class
try:
    person = Person(25)  # Valid age
    print(f"Person's age: {person.age}")
    
    person.age = 30  # Valid age update
    print(f"Updated person's age: {person.age}")
    
    person.age = -5  # Invalid age (will raise an exception)
except ValueError as e:
    print(e)
