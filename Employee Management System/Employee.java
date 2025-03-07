class Employees {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public Employees(int id, String name, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: Rs " + employeeSalary);
        System.out.println("------------------------");
    }
}

public class Employee {
    public static void main(String[] args) {
        // Creating Employee objects
        Employees emp1 = new Employees(1001, "Rajesh Khana", 55000);
        Employees emp2 = new Employees(1002, "Veerabadra Hareesh", 62000);
        Employees emp3 = new Employees(1003, "Yash Raj", 48000);

        System.out.println("Employee Records:");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
