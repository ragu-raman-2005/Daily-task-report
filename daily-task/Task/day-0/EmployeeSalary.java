
import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee details
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Salary calculation
        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;
        double pf = basicSalary * 12 / 100;

        double grossSalary = basicSalary + hra + da;

        double netSalary = grossSalary - pf;

        // Display details
        System.out.println("\n===== EMPLOYEE SALARY DETAILS =====");

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);

        sc.close();
    }
}
