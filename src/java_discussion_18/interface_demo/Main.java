package java_discussion_18.interface_demo;


public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.swim();
        human.drink("human");

        Animal animal_human = new Human();
        animal_human.drink("Human");

    }
}
