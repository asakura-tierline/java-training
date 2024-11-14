// Subclass Car, inheriting from Vehicle
class Car extends Vehicle {
  // Additional attribute for the Car class
  private int numberOfDoors;

  // Constructor to initialize Car, including Vehicle attributes
  public Car(String brand, int year, int numberOfDoors) {
      // Call the superclass (Vehicle) constructor
      super(brand, year);
      this.numberOfDoors = numberOfDoors;
  }

  // Method to display car details, including Vehicle details
  public void displayCarInfo() {
      displayInfo(); // Call the displayInfo method from Vehicle
      System.out.println("Number of Doors: " + numberOfDoors);
  }
}


