package java_discussion_15;

public class Course {
    private String courseId;
    private int credit;

    public Course(String courseId, int credit){
        this.courseId = courseId;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
