// Define a generic Box class
class Box<T> {
  // Generic type T to hold an item
  private T item;

  // Setter method to store an item in the box
  public void setItem(T item) {
      this.item = item;
  }

  // Getter method to retrieve the item from the box
  public T getItem() {
      return item;
  }
}

// Main class to test the generic Box class
public class Main {
  public static void main(String[] args) {
      // Create a Box for Integer type
      Box<Integer> intBox = new Box<>();
      intBox.setItem(42);
      System.out.println("Integer Box contains: " + intBox.getItem());

      // Create a Box for String type
      Box<String> stringBox = new Box<>();
      stringBox.setItem("Hello, Generics!");
      System.out.println("String Box contains: " + stringBox.getItem());

      // Create a Box for Double type
      Box<Double> doubleBox = new Box<>();
      doubleBox.setItem(3.14);
      System.out.println("Double Box contains: " + doubleBox.getItem());
  }
}
