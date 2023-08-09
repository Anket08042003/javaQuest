// The Dog class definition
class Dog {
    // Attributes (instance variables)
    String name;
    int age;

    // Method to make the dog bark
    void bark() {
        System.out.println(name + " is barking!");
    }

    // Method to show the dog's age
    void showAge() {
        System.out.println(name + " is " + age + " years old.");
    }
}

// Main class to use the Dog class
public class example2 {
    public static void main(String[] args) {
        // Creating objects of the Dog class
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.age = 3;

        Dog dog2 = new Dog();
        dog2.name = "Daisy";
        dog2.age = 5;

        // Using methods of the Dog class
        dog1.bark();
        dog1.showAge();

        dog2.bark();
        dog2.showAge();
    }
}

