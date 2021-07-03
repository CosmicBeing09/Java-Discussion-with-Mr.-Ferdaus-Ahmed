package java_discussion_18.interface_demo;

public class Dog implements Animal{

    // f(x) = x + 2; f(2) -> 4
    // f(x, y) = x^2 + y^2 - r^2

    @Override
    public void eat(String species) {
        System.out.println(species + " : is eating");
    }

    @Override
    public void drink(String species) {
        System.out.println(species + " : is drinking");
    }

    @Override
    public void run(String species) {
        System.out.println(species + " : is running");
    }
}
