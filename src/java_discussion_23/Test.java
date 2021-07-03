package java_discussion_23;

import java_discussion_22.Circle;
import java_discussion_22.Rectangle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(15, 5);

//        GenericsDemo demo1 = new GenericsDemo(circle);
//        GenericsDemo demo2 = new GenericsDemo(rectangle);

        GenericsDemo<Rectangle> demo1 = new GenericsDemo<Rectangle>(rectangle);
        GenericsDemo<Circle> demo2 = new GenericsDemo<Circle>(circle);


        Circle tempCircle = (Circle) demo2.getObject();
        System.out.println(tempCircle.getRadius());
    }
}
