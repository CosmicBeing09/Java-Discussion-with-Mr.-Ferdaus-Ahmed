import Shape.*;

import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Box box1 = new Box(20, 10, 30);

        Box box2 = new Box();

//        Scanner scanner = new Scanner(System.in);
//        int height = scanner.nextInt();
//        int width = scanner.nextInt();
//        int length = scanner.nextInt();

        box2.setProperty(30, 9, 33);

        System.out.println(box1.volume());
        System.out.println(box2.volume());

        box1.setProperty(20, 10, 25);

        if(box1.volume() > box2.volume()){
            System.out.println("Box1 is larger");
        }
        else {
            System.out.println("Box2 is larger");
        }

        if(box1.density(10) > box2.density(15)){
            System.out.println("Box1 is denser");
        }
        else System.out.println("Box2 is denser");

        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(15);
        Triangle triangle = new Triangle(10,15);

        System.out.println(rectangle.area());
        System.out.println(circle.area());
        System.out.println(triangle.area());

        rectangle.whatIsThisShape("Rectangle");
        circle.whatIsThisShape("Circle");
    }
}
