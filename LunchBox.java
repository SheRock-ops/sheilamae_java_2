
public class Lunchbox {
    private String customerName;
    private String mainItem;
    private int quantity;
    private double price;
    private boolean isDelivered;

    // Default constructor
    public Lunchbox() {
        this.customerName = "";
        this.mainItem = "";
        this.quantity = 1;
        this.price = 10.99;
        this.isDelivered = false;
    }

    // Constructor with arguments
    public Lunchbox(String customerName, String mainItem, int quantity, double price) {
        this.customerName = customerName;
        this.mainItem = mainItem;
        this.quantity = quantity;
        this.price = price;
        this.isDelivered = false;
    }

    // Getters
    public String getCustomerName() { return customerName; }
    public String getMainItem() { return mainItem; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public boolean isDelivered() { return isDelivered; }

    // Setters
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setMainItem(String mainItem) { this.mainItem = mainItem; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }
    public void setDelivered(boolean delivered) { isDelivered = delivered; }

    // Mark delivered
    public void markDelivered() {
        this.isDelivered = true;
    }

    // Display order
    public void displayOrder() {
        System.out.printf(
            "Customer: %s | Item: %s | Qty: %d | Price: $%.2f | Delivered: %b%n",
            customerName, mainItem, quantity, price, isDelivered
        );
    }
}
