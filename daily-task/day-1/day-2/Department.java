
import java.util.ArrayList;

public class Department {

    private int departmentId;
    private String departmentName;

    // One department can have many employees
    private ArrayList<Employee> employees;

    // Constructor
    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Add employee to department
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getEmployeeName() + " added successfully!");
    }

    // Display department details
    public void displayDepartment() {
        System.out.println("\nDepartment ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);

        System.out.println("\nEmployee Details:");

        for (Employee employee : employees) {
            employee.displayEmployee();
            System.out.println("------------------");
        }
    }
}
