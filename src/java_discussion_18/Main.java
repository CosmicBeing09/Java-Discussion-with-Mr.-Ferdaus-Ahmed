package java_discussion_18;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run("Huskey");
        dog.bark("Huskey");

        Human raihan = new Human();
        raihan.run("raihan");
        raihan.talk("raihan");

        Animal animal_human = new Human();
        animal_human.run("raihan");
        // animal_human.talk("raihan"); -> allowed

    }
}
