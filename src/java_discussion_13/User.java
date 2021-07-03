package java_discussion_13;

public class User {
    private int userId;
    private String name;
    private String phoneNum;

    public User(int userId, String name, String phoneNum) {
        this.userId = userId;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
