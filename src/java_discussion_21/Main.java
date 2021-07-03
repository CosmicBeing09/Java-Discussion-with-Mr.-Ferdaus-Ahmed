package java_discussion_21;

public class Main {

    public static void main(String[] args) {
        Product tomato = new Product(101, "Tomato", 25);
        Product potato = new Product(102, "Potato", 20);
        Product mango = new Product(103, "Mango", 55);
        Product banana = new Product(104, "Banana", 3.5);

        Customer raihan = new Customer(201, "Raihan", "01835");

        Cart cart1 = new Cart(301);
        cart1.createCart(raihan.getUserId());

        cart1.addToCart(tomato, 5);
        cart1.addToCart(potato, 9);
        cart1.addToCart(mango, 10);
        cart1.addToCart(banana, 12);


        Payment receipt1 = new Payment(401);
        receipt1.calculatePrice(cart1);
        receipt1.makePayment(500);
        receipt1.makePayment(1000);
        receipt1.makePayment(100);

    }
}
