package java_discussion_22;

public class Circle implements Shape{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.1416 * radius * radius;
    }

    @Override
    public double calculateSurface() {
        return 2 * 3.1416 * radius;
    }

    public double getRadius(){
        return this.radius;
    }

}
