
import java.security.SecureRandom;

public class Lunch {
    Lunchbox[] orders;
    String[] desserts = {"Yogurt", "Cookie", "Cupcake", "Fruit", "Flan"};
    SecureRandom random = new SecureRandom();

    public Lunch(int size) {
        orders = new Lunchbox[size];
    }

    // Add a new order
    public void addOrder(int index, Lunchbox order) {
        if (index >= 0 && index < orders.length) {
            orders[index] = order;

            // Add random dessert
            String freeDessert = desserts[random.nextInt(desserts.length)];
            System.out.println("🎁 Free dessert added: " + freeDessert);
        }
    }

    // Add quantity to an existing order
    public void addQuantity(int index, int amount) {
        if (orders[index] != null) {
            orders[index].setQuantity(orders[index].getQuantity() + amount);
        }
    }

    // Mark delivered
    public void deliverOrder(int index) {
        if (orders[index] != null) {
            orders[index].markDelivered();
        }
    }

    // View all orders
    public void viewOrders() {
        System.out.println("\n--- All Lunch Orders ---");
        for (int i = 0; i < orders.length; i++) {
            System.out.print((i + 1) + ". ");
            if (orders[i] != null) {
                orders[i].displayOrder();
            } else {
                System.out.println("Empty slot");
            }
        }
    }

    // Calculate total sales
    public double totalSales() {
        double total = 0;
        for (Lunchbox order : orders) {
            if (order != null) {
                total += order.getPrice() * order.getQuantity();
            }
        }
        return total;
    }
}

