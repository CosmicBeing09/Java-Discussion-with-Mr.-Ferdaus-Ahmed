package java_discussion_18.interface_demo;

public class Sloth implements Animal{

    @Override
    public void eat(String species) {
        System.out.println(species + " : is eating");
    }

    @Override
    public void drink(String species) {
        System.out.println(species + " : is eating");
    }

    @Override
    public void run(String species) {
        System.out.println(species + " : is walking");
    }
}
