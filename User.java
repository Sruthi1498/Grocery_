package grocery;

class User {

    private final Integer Uid;
    private String Fname;
    private String Lname;

    public User(Integer Uid, String Fname, String Lname) {
        this.Uid = Uid;
        this.Fname = Fname;
        this.Lname = Lname;

    }

    public String getFName() {
        return Fname;
    }

    public void setFName(String Fname) {
        this.Fname = Fname;
    }

    public String getLName() {
        return Lname;
    }

    public void setLName(String Lname) {
        this.Lname = Lname;
    }

    public Integer getUid() {
        return Uid;
    }
}
