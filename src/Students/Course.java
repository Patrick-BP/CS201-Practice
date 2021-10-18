package Students;

public class Course {
    private String cId;
    private String cName;
    private int credit;

    public Course(String cId, String cName, int credit) {
        this.cId = cId;
        this.cName = cName;
        this.credit = credit;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
