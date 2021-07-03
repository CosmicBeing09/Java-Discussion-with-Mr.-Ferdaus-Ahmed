package java_discussion_20;

public class Cart {
    private int cartId;
    int userId;

    Product[] products; //products[0] = tomato
    double[] numOfUnits; // numOfUnits[0] = 5
    private int i = 0;

    public Cart(int cartId){
        this.cartId = cartId;
    }

    public void createCart(int userId){
        this.userId = userId;
        products = new Product[9999];
        numOfUnits = new double[9999];
        System.out.println("Cart created");
    }

    public void addToCart(Product product, double quantity){
       products[i] = product;
       numOfUnits[i] = quantity;
       i++;
    }

    public int getCartSize(){
        return i;
    }

}
