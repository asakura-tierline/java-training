// Define the Book class
class Book {
  // Attributes of the Book class
  private String title;
  private String author;
  private int year;

  // Constructor to initialize the Book object
  public Book(String title, String author, int year) {
      this.title = title;
      this.author = author;
      this.year = year;
  }

  // Method to display book details
  public void displayDetails() {
      System.out.println("Title: " + title);
      System.out.println("Author: " + author);
      System.out.println("Year: " + year);
  }

  // Method to calculate the age of the book
  public int bookAge(int currentYear) {
      return currentYear - year;
  }
}

// Main class to test the Book class
public class Main {
  public static void main(String[] args) {
      // Create an instance of the Book class
      Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

      // Call methods on the book instance
      book1.displayDetails();
      System.out.println("Age of the book: " + book1.bookAge(2024) + " years");
  }
}
