package Shape;

public class Triangle extends Shape{
    private int height;
    private int base;

    public Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }


    public double area(){
        return 0.5 * height * base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
