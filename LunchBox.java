
import java.util.Scanner;

public class LunchBox {
  public static void main(String[] args) {
    Scanner skyler = new Scanner(System.in);
    
    System.out.print("Enter customer name: ");
    String customerName = skyler.nextLine();
    
    System.out.print("Enter main item: ");
    String mainItem = skyler.nextLine();
    
    System.out.print("Enter quantity: ");
    int quantity = skyler.nextInt();
    
    System.out.print("Enter price: ");
    double price = skyler.nextDouble();
    
    Lunch lunchOrder = new Lunch(customerName, mainItem, quantity, price);
    
    lunchOrder.displayOrderDetails();
    
    System.out.print("Enter delivery amount: ");
    int deliveryAmount = skyler.nextInt();
    
    lunchOrder.setDelivered(deliveryAmount);
    
    System.out.print("Enter discount percentage: ");
    int discountPercentage = skyler.nextInt();
    
    lunchOrder.calculateDiscount(discountPercentage, deliveryAmount);
    
    System.out.println("\nUpdated Order Details:");
    lunchOrder.displayOrderDetails();
    
    skyler.close();
  } // main 
} // class