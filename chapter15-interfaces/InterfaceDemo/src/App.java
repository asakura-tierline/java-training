// Main class to test the interface implementation
public class App {
  public static void main(String[] args) {
      // Create instances of Dog and Cat
      Animal myDog = new Dog();
      Animal myCat = new Cat();

      // Call methods on Dog instance
      System.out.println("Dog:");
      myDog.sound();
      myDog.eat();

      // Call methods on Cat instance
      System.out.println("\nCat:");
      myCat.sound();
      myCat.eat();
  }
}
// Define the Animal interface
interface Animal {
  // Method declarations (no implementations in an interface)
  void sound();
  void eat();
}

// Dog class implements the Animal interface
class Dog implements Animal {
  // Provide implementation for sound method
  public void sound() {
      System.out.println("Dog barks");
  }

  // Provide implementation for eat method
  public void eat() {
      System.out.println("Dog eats bones");
  }
}

// Cat class implements the Animal interface
class Cat implements Animal {
  // Provide implementation for sound method
  public void sound() {
      System.out.println("Cat meows");
  }

  // Provide implementation for eat method
  public void eat() {
      System.out.println("Cat eats fish");
  }
}
