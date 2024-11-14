// Base class Vehicle
class Vehicle {
  // Attributes of the Vehicle class
  private String brand;
  private int year;

  // Constructor to initialize Vehicle
  public Vehicle(String brand, int year) {
      this.brand = brand;
      this.year = year;
  }

  // Method to display vehicle details
  public void displayInfo() {
      System.out.println("Brand: " + brand);
      System.out.println("Year: " + year);
  }
}
