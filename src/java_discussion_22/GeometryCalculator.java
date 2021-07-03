package java_discussion_22;

public class GeometryCalculator {

    public void calculateAreaOfaShape(Shape shape){
        shape.calculateArea();
    }


    public static void main(String[] args) {
        GeometryCalculator gc = new GeometryCalculator();

        Circle circle = new Circle(5.5);
        gc.calculateAreaOfaShape(circle);

        Rectangle rectangle = new Rectangle(10, 5.5);
        Square square = new Square(6.0);

        gc.calculateAreaOfaShape(rectangle);
        gc.calculateAreaOfaShape(square);
    }
}
