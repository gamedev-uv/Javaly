//WAP in Java to create an Employee class with ID, name, and basic salary. Calculate HRA (20%), DA (10%), and gross salary

import java.util.Scanner;

class Employee
{
    public String ID;
    public String Name;
    public float BasicSalary;

    public float GetHRA()
    {
        return 0.2f * BasicSalary;
    }

    public float GetDA()
    {
        return 0.1f * BasicSalary;
    }

    public float GetGrossSalary()
    {
        return BasicSalary + GetHRA() + GetDA();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("--- INPUT ---");

        System.out.print(" - ID: ");
        employee.ID = sc.next();
        sc.nextLine();

        System.out.print(" - Name: ");
        employee.Name = sc.nextLine();

        System.out.print(" - Basic Salary: ");
        employee.BasicSalary = sc.nextFloat();

        System.out.println("\n--- OUTPUT ---");
        System.out.println(" - ID: " + employee.ID);
        System.out.println(" - Name: " + employee.Name);
        System.out.println(" - Base Salary: " + employee.BasicSalary);
        System.out.println(" - HRA: " + employee.GetHRA());
        System.out.println(" - DA: " + employee.GetDA());
        System.out.println(" - Total Salary: " + employee.GetGrossSalary());
    }
}