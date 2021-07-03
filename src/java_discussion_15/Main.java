package java_discussion_15;

public class Main {
    public static void main(String[] args){
        Program SWE = new Program("2016-17", "4th");

        Course eng101 = new Course("ENG101", 3);
        Instructor samir = new Instructor(101, "Samir" , "SWE");
        Student raihan = new Student(101, "Raihan", "2016-17");
        Student nazia = new Student(102, "Nazia", "2017-18");

        SWE.addInstructor(samir);
        SWE.addCourse(eng101);
        SWE.addStudent(raihan);
        SWE.addStudent(nazia);

//        String s = "mohammed raihan ullah";
//        int index = 0;
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) == ' ' || i == s.length() - 1){
//                for(int j = i - 1; j >= index; j--){
//                    System.out.print(s.charAt(j));
//                }
//                index = i;
//                System.out.print(" ");
//            }
//
//        }

    }
}
