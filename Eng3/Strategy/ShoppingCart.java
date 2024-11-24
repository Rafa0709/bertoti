import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<String> items = new ArrayList<>();
    private int totalAmount = 0;

    public void addItem(String item, int price) {
        items.add(item);
        totalAmount += price;
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        System.out.println("Items in Cart: " + items);
        System.out.println("Total Amount: " + totalAmount);
        paymentStrategy.pay(totalAmount);
    }
}

