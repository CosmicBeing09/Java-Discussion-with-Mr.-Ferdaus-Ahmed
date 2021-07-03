package java_discussion_21;

public class Payment {
    private int receiptNo;
    private double totalAmount = 0;
    private boolean isPaid = false;

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

    void makePayment(double taka){
        if(isPaid){
            System.out.println("Already paid!");
        }
        else if(getTotalAmount() > taka){
            System.out.println("Not enough money!!");
        }
        else {
            System.out.println("Payment successful");
            double return_ = taka - getTotalAmount();
            System.out.println("Return : " + return_);
            isPaid = true;
        }

//        if(getTotalAmount() > taka){
//            System.out.println("Not enough money!!");
//            return;
//        }
//
//        System.out.println("Payment successful");
//        double return_ = taka - getTotalAmount();
//        System.out.println("Return : " + return_);
//        isPaid = true;
    }
}
