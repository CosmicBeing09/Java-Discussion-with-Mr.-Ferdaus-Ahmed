package java_discussion_15;

public class Program {
    private String session;
    private String semester;

    private Instructor[] instructors = new Instructor[5];
    private int indexOfInstructor = 0;

    private Course[] courses = new Course[10];
    private int indexOfCourse = 0;

    private Student[] students = new Student[100];
    private int indexOfStudent = 0;

    public Program(String session, String semester){
        this.session = session;
        this.semester = semester;

        System.out.println("Program Created for session : " + session +
                " Semester : " + semester);
        lineSpearator();
    }

    public void addInstructor(Instructor instructor){
        instructors[indexOfInstructor] = instructor;
        indexOfInstructor++;

        System.out.println("Instructor added with id : " + instructor.getInstructorId()
                + " Name : " + instructor.getName());

        lineSpearator();
    }

    public void addCourse(Course course){
        courses[indexOfCourse++] = course;

        System.out.println("Course added with id : " + course.getCourseId() +
                " Credit : " + course.getCredit());

        lineSpearator();
    }

    public void addStudent(Student student){

        if(this.session.equals(student.getSession())){ // this.session == student.getSession()
            students[indexOfStudent] = student;
            indexOfStudent++;
            System.out.println("Student Added with Id : " + student.getId() +
                    " Name : " + student.getName());

        }

        else {
            System.out.println("Student not eligible for this Program");
        }
        lineSpearator();

    }

    private void lineSpearator(){
        System.out.println();
        System.out.println("=================================");
    }

}
