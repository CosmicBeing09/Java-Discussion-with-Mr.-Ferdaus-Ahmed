public class Dog extends Animal{
    String name;

    public Dog(String name, String breed, int tag){
        this.name = name;

        super.breed = breed;
        collarTag = tag;
    }

    public String getName() {
        return name;
    }

}
