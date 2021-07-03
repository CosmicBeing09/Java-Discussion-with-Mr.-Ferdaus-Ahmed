package Shape;

abstract class Shape {

    public void whatIsThisShape(String s){
        System.out.println("This shape is: " + s);
    }

    abstract double area();

}
