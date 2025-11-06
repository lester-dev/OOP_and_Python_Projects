// Base class Animal
class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog inherits Animal
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Woof!");
    }
}

// Subclass Cat inherits Animal
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow!");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.speak();  // Output: Woof
        myCat.speak();  // Output: Meow
    }
}
