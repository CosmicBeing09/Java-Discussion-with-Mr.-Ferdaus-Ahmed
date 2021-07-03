package java_discussion_18;

public class Human extends Animal{

    @Override
    void run(String species) {
        super.run(species);
        System.out.println("After 5 mins he is now walking");
    }

    void talk(String name){
        System.out.println(name + " : is talking");
    }
}
