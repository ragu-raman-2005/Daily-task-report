import java.util.Scanner;

class Employee {

    String name;
    int employeeId;
    double basicSalary;
    double hra, da, ta, pf;
    double grossSalary, netSalary;

    void calculateSalary() {

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        ta = basicSalary * 0.05;
        pf = basicSalary * 0.12;

        grossSalary = basicSalary + hra + da + ta;

        netSalary = grossSalary - pf;
    }

  
    void displaySalary() {

        System.out.println("\n===== EMPLOYEE SALARY SLIP =====");

        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + employeeId);

        System.out.println("-------------------------------");

        System.out.println("Basic Salary  : Rs." + basicSalary);
        System.out.println("HRA           : Rs." + hra);
        System.out.println("DA            : Rs." + da);
        System.out.println("TA            : Rs." + ta);

        System.out.println("-------------------------------");

        System.out.println("Gross Salary  : Rs." + grossSalary);
        System.out.println("PF Deduction  : Rs." + pf);

        System.out.println("-------------------------------");

        System.out.println("Net Salary    : Rs." + netSalary);

        System.out.println("===============================");
    }
}

public class EmployeeSalaryCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       Employee emp = new Employee();

        System.out.print("Enter Employee Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        emp.employeeId = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        emp.basicSalary = sc.nextDouble();

        if (emp.basicSalary < 0) {
            System.out.println("Invalid Salary!");
        } else {

            emp.calculateSalary();

            emp.displaySalary();
        }

        sc.close();
    }
}