class ArrayCopyDemo {
  // Copy 7 elements from index 2 of copyFrom to copyTo starting at index 0
  public static void main(String[] args) {
      String[] copyFrom = {
          "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
          "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
          "Marocchino", "Ristretto" };

      String[] copyTo = new String[7];
      System.arraycopy(copyFrom, 2, copyTo, 0, 7);
      for (String coffee : copyTo) {
          System.out.print(coffee + " ");
      }
  }
}
