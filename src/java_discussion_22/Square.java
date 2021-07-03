package java_discussion_22;

public class Square implements Shape{
    double arm;

    public Square(double arm){
        this.arm = arm;
    }

    @Override
    public double calculateArea() {
        return arm * arm;
    }

    @Override
    public double calculateSurface() {
        return 4 * arm;
    }
}
