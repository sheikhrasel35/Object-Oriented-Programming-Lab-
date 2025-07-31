// File: AbstractionExample.java

// Abstract class
abstract class Animal {
    // Abstract method (must be implemented in child classes)
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Dog class extends Animal and implements abstract method
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Bark bark!");
    }
}

// Cat class extends Animal and implements abstract method
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says: Meow meow!");
    }
}

// Main class to test abstraction
public class AbstractionExample {
    public static void main(String[] args) {
        // Using abstract class reference to refer to Dog object
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Dog says: Bark bark!
        myDog.eat();        // Output: This animal eats food.

        // Using abstract class reference to refer to Cat object
        Animal myCat = new Cat();
        myCat.makeSound();  // Output: Cat says: Meow meow!
        myCat.eat();        // Output: This animal eats food.
    }
}
