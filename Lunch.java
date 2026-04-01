import java.security.SecureRandom;

public class Lunch {
  
  private String customerName;
  private String mainItem;
  private int quantity;
  private double price;
  private final int MAX_DELIVERY_AMOUNT = 10; // Maximum delivery amount for the lunch order
  private SecureRandom randNum = new SecureRandom();
  private boolean isDelivered;

  public Lunch(String customerName, String mainItem, int quantity, double price) {
    this.customerName = customerName;
    this.mainItem = mainItem;
    this.quantity = randNum.nextInt(10) + 1; // Random quantity between 1 and 10
    this.price = randNum.nextDouble( 10) * price; // Random price between 0 and the specified price
    this.isDelivered = false; // Default to not delivered
  }
   // getters 
  public String getCustomerName() {
    return this.customerName;
  }
  public String getMainItem() {
    return this.mainItem;
  }
  public int getQuantity() {
    return this.quantity;
  }
  public double getPrice() {
    return this.price;
  }
  public boolean isDelivered() {
    return this.isDelivered;
  }
  public void displayOrderDetails() {
    System.out.println("Customer Name: " + this.customerName);
    System.out.println("Main Item: " + this.mainItem);
    System.out.println("Quantity: " + this.quantity);
    System.out.println("Price: $" + String.format("%.2f", this.price));
    System.out.println("Delivered: " + (this.isDelivered ? "Yes" : "No"));
  }
  // setters
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public void setMainItem(String mainItem) {
    this.mainItem = mainItem;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public void setDelivered(int amount) {
    if(amount >= MAX_DELIVERY_AMOUNT ) {
      this.isDelivered = true; // Mark as delivered if the amount meets or exceeds the maximum delivery amount
    }
  }
  public void calculateDiscount(int discountPercentage, int amount) {
    if (amount >= MAX_DELIVERY_AMOUNT) {
    this.price = this.price * (1 - discountPercentage / 100.0); // Apply the discount to the price
    }
  }
} // Class 
