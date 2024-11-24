class Strategy {
    public static void main (String[] args){
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 1000);
        cart.addItem("Mouse", 50);

        PaymentStrategy creditCardPayment = new CreditCardPayment("John Doe", "1234-5678-9876-5432");
        cart.checkout(creditCardPayment);

        System.out.println();

        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");
        cart.checkout(payPalPayment);
    }
}