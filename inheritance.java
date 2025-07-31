// File: InheritanceDemo.java

// Superclass (Base class)
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass 1: Student inherits from Person
class Student extends Person {
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        super(name, age); // Call to Person constructor
        this.studentId = studentId;
    }

    // Student-specific method
    public void study() {
        System.out.println("Student is studying.");
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call base method
        System.out.println("Student ID: " + studentId);
    }
}

// Subclass 2: Teacher inherits from Person
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call to Person constructor
        this.subject = subject;
    }

    // Teacher-specific method
    public void teach() {
        System.out.println("Teacher is teaching " + subject + ".");
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call base method
        System.out.println("Subject: " + subject);
    }
}

// Main class to test the inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Rasel", 23, "OOP");
        System.out.println("Student Info:");
        student.displayInfo();
        student.study();

        System.out.println("\n------------------------\n");

        // Create a Teacher object
        Teacher teacher = new Teacher("Mr Partho", 28, "OOP");
        System.out.println("Teacher Info:");
        teacher.displayInfo();
        teacher.teach();
    }
}
