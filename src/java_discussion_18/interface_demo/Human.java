package java_discussion_18.interface_demo;

public class Human implements Animal, Fish{

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

    @Override
    public void swim() {
        System.out.println("Human is swimming");
    }
}
