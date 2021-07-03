public class Student {

    public static double pi = 3.1416;

    private int chemMarks;
    public int age;

    public Student(int temp){ //Constructor
        age = temp;
    }

    int getAge(){
        return age;
    }

    void printAge(){
        System.out.println("Age is: " + age);
    }

    void setChemMarks(int marks){
        chemMarks = marks;
    }

    void calculateGrade(){
        if(chemMarks >= 80) System.out.println("Letter grade");
        else System.out.println("Not Letter grade");
    }

    public static void printSomething(){
        System.out.println("Hello World");
    }


}
