package java_discussion_21;

public class Customer {
    private int userId;
    private String userName;
    private String phoneNo;

    public Customer(int userId, String phoneNo) {
        this.userId = userId;
        this.phoneNo = phoneNo;
    }

    public Customer(int userId, String userName, String phoneNo) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNo = phoneNo;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
