/*
WAP in Java to Create a class Employee with attributes name and salary and a method to display them.
Create a class Manager that inherits from Employee and adds an attribute department. Display all the details
*/

import java.util.Scanner;

class Employee
{
    public String name;
    public float salary;

    public void DisplayDetails()
    {
        System.out.println("Name  : " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee
{
    public String Department;

    @Override
    public void DisplayDetails()
    {
        super.DisplayDetails();
        System.out.println("Department: " + Department);
    }
}

class EmployeeManager
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        Manager manager = new Manager();

        System.out.println("--- INPUT ---");
        System.out.println(" -- Enter Employee Details --");

        System.out.print("  - Name: ");
        employee.name = sc.nextLine();

        System.out.print("  - Salary: ");
        employee.salary = sc.nextFloat();

        System.out.println("\n -- Enter Manager Details --");

        sc.nextLine();
        System.out.print("  - Name: ");
        manager.name = sc.nextLine();

        System.out.print("  - Salary: ");
        manager.salary = sc.nextFloat();
        
        sc.nextLine();
        System.out.print("  - Department: ");
        manager.Department = sc.nextLine();

        System.out.println("\n--- OUTPUT ---");
        employee.DisplayDetails();
        System.out.println();
        manager.DisplayDetails();
    }
}