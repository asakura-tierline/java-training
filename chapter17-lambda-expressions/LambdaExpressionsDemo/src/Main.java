@FunctionalInterface
interface Greeting {
    void sayHello(String name);  //Abstract method
}

// Main Class to demonstrate Lambda Expressions
public class Main {
  public static void main(String[] args) {
      // Using a lambda expression to implement the Greeting interface
      Greeting greet = (name) -> {
          System.out.println("Hello, " + name + "!");
      };

      // Call the method using the lambda expression
      greet.sayHello("Yuta");
      greet.sayHello("Asakura");
  }
}
