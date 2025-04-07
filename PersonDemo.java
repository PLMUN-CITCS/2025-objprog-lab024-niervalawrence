class Person {
    // Attributes
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display the person's information
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Create Person objects
        Person person1 = new Person("Bob", 30);
        Person person2 = new Person();

        // Display their information
        person1.displayPerson();
        person2.displayPerson();
    }
}
