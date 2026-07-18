package Collections.List.Q7.java;


public class Employee {

    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public String toString() {
        return "Employee ID: " + empId +
               ", Employee Name: " + empName;
    }
}