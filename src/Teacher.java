public class Teacher {
    private int id;
    private int age;

    public Teacher(int id, int age){
        this.id = id;
        this.age = age;
    }

    public Teacher(int id){
        this.id = id;
    }

    public Teacher(){
    }


    int retriveId(){
        return id;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return this.age;
    }

    int getId(){
        return this.id;
    }

}
