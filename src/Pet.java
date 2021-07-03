public class Pet {
    String petType;
    String name;
    String breed;
    int collarTag;

    public Pet(){
        petType = "Not Identified Yet";
        name = "Invalid";
        breed = "Not Identified Yet";
        collarTag = 0;
    }

    public Pet(String petType){
        this.petType = petType;
    }

    public Pet(String petType, String breed){
       this.petType = petType;
       this.breed = breed;
    }

    public String getPetType(){
        return petType;
    }

    public boolean _equals(Pet pet){
        String type = pet.getPetType();
        boolean isEqual = this.petType.equals(type);

        return isEqual;
    }

}
