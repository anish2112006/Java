// File: EmployeeDetails.java

import java.util.Scanner;

public class EmployeeDetails {
    
    // Properties of the Employee class
    String name;
    int id;
    double salary;

    // Method to display employee details
    public void displayDetails() {
        System.out.println("\n=== Employee Information ===");
        System.out.println("Employee ID    : " + id);
        System.out.println("Employee Name  : " + name);
        System.out.println("Employee Salary: ₹" + salary);
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeDetails emp = new EmployeeDetails();

        // Collecting input
        System.out.print("Enter Employee ID: ");
        emp.id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        emp.name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ₹");
        emp.salary = scanner.nextDouble();

        // Displaying output
        emp.displayDetails();

        scanner.close();
    }
}
