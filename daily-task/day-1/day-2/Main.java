
public class Main {

    public static void main(String[] args) {

        // Creating Employee objects
        Employee emp1 = new Employee(101, "Arun", 30000);
        Employee emp2 = new Employee(102, "Priya", 35000);
        Employee emp3 = new Employee(103, "Ram", 40000);

        // Creating Department object
        Department dept = new Department(1, "IT");

        // Adding employees to department
        dept.addEmployee(emp1);
        dept.addEmployee(emp2);
        dept.addEmployee(emp3);

        // Display department and employee details
        dept.displayDepartment();
    }
}
