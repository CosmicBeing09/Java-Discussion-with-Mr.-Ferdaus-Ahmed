package java_discussion_15;

public class Student {
    private int id;
    private String name;
    private String session;

    public Student(int id, String name, String session){
        this.id = id;
        this.name = name;
        this.session = session;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
