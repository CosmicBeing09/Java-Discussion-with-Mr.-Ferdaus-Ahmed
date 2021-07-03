public class Cow extends Animal{
    String farmName;

    public Cow(String farmName, String breed, int collarTag){
        this.farmName = farmName;

        super.breed = breed;
        super.collarTag = collarTag;
    }


    public String getFarmName(){
        return farmName;
    }
}
