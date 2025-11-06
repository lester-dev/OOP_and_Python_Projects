class Animal:
    def speak(self):
        pass

class Dog(Animal):
    def speak(self):
        print ("Woof!")
        print ("Bark!")
        print ("Growl!")

class Cat(Animal):
    def speak(self):
        print ("Meow!")
        print ("Roar!")
        print ("Purr!")

dog = Dog()
cat = Cat()

dog.speak() 
cat.speak()