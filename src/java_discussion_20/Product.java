package java_discussion_20;

public class Product {
    private int id;
    private String productName;
    private double pricePerUnit;

    public Product(int id, String productName, double pricePerUnit){
        this.id = id;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
