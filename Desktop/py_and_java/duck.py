class Bird:
    def speak(self):
        print("Tweet!")

class Robot:
    def speak(self):
        print("Beep boop!")

def make_it_speak(obj):
    obj.speak()

# Example usage
bird = Bird()
robot = Robot()

make_it_speak(bird)   # Output: Tweet!
make_it_speak(robot)  # Output: Beep boop!
