package au.edu.jcu.cp3405.prototype;

public class Contact {
    private String name;
    private String mobileNum;
    private String email;
    private String id;

    public Contact() {
        name = "";
        mobileNum = "";
        email = "";
        id = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return mobileNum;
    }

    public void setPhone(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
