public class Emp {

    private int id;
    private float salary;
    private String ename;

    Emp() {
        System.out.println("Creating Employee");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", salary=" + salary +
                ", ename='" + ename + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getId() {
        return id;
    }

    public float getSalary() {
        return salary;
    }

    public String getEname() {
        return ename;
    }

    Emp(int id, float salary, String ename) {
        this.id = id;
        this.salary = salary;
        this.ename = ename;
    }

    void display() {
        System.out.println("Employee ID: " + this.id + "," + "Salary: " + this.salary + "," + "Name: " + this.ename);
    }
}
