package java_discussion_20;

public class Payment {
    private int receiptNo;
    private double totalAmount = 0;
    boolean isPaid = false;

    public Payment(int receiptNo) {
        this.receiptNo = receiptNo;
    }

    void calculatePrice(Cart cart){

        for(int i=0; i < cart.getCartSize(); i++){

            printItem(cart.products[i], cart.numOfUnits[i]);

            totalAmount += (cart.products[i].getPricePerUnit() *
                                         cart.numOfUnits[i])  ;
        }

        System.out.println("========================================================");
        System.out.println("Total Amount = " + "          " + totalAmount);

    }

    public double getTotalAmount() {
        return totalAmount;
    }

    void printItem(Product product, double quantity){
        System.out.println(product.getProductName() + "   " + product.getPricePerUnit() +
                " *  " + quantity + "   =  " +  product.getPricePerUnit() * quantity);
    }

}
