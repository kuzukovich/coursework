package sky.pro.base;

public class Employee {
    final private String fullName;
    private int salary;
    private int department;
    private static int counter = 0;

    public static int countAdd() {
        counter++;
        return counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;

    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getDepartment() {
        return department;
    }

}
