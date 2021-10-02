package chapter4;

public class Employee {
    private String fname;
    private String lname;
    private double salary;
    private Address homeAddress;
    private Address workAddress;

    public Employee() {
    }

    public Employee(String fname, String lname, double salary, Address homeAddress, Address workAddress) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }
}
