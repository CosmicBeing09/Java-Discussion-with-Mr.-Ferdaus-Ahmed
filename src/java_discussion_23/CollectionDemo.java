package java_discussion_23;

import java_discussion_22.Circle;
import java_discussion_22.Rectangle;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(15, 5);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Raihan ");
        arrayList.add("Ullah");

        ArrayList<Rectangle> rectangleArrayList = new ArrayList<>();
        rectangleArrayList.add(rectangle);



        String name = arrayList.get(0) + arrayList.get(1);
        System.out.println(name);







    }
}
