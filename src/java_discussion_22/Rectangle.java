package java_discussion_22;

public class Rectangle implements Shape{
    double arm1;
    double arm2;

    public Rectangle(double arm1, double arm2){
        this.arm1 = arm1;
        this.arm2 = arm2;
    }

    @Override
    public double calculateSurface() {
        return 2 * (arm1 + arm2);
    }

    @Override
    public double calculateArea() {
        return arm1 * arm2;
    }

    public Rectangle getObject(){
        return new Rectangle(15, 5);
    }
}
