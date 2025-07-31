// File: PolymorphismExample.java

// Superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Class demonstrating compile-time polymorphism
class Calculator {
    // Method overloading - same method name, different parameters

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class to test polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {

        System.out.println("=== Runtime Polymorphism (Overriding) ===");

        // Runtime polymorphism: Animal reference to Dog and Cat
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Output: The animal makes a sound.
        myDog.makeSound();    // Output: The dog barks.
        myCat.makeSound();    // Output: The cat meows.

        System.out.println("\n=== Compile-time Polymorphism (Overloading) ===");

        // Compile-time polymorphism: method overloading
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(10, 20));               
        System.out.println("add(double, double): " + calc.add(5.5, 6.7));        
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));          
    }
}
