/*
WAP in Java to create three classes: Person, Employee, and Manager.
Demonstrate multilevel inheritance and display the details of a manager.
*/

import java.util.Scanner;

class Person
{
    public String Name;
    public int Age;

    public void DisplayDetails()
    {
        System.out.println("Name      : " + Name);
        System.out.println("Age       : " + Age);
    }
}

class Employee extends Person
{
    public float Salary;

    @Override
    public void DisplayDetails()
    {
        super.DisplayDetails();
        System.out.println("Salary    : " + Salary);
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

class MultiInheritance
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();

        System.out.println("--- INPUT ---");
        System.out.print(" - Name: ");
        manager.Name = sc.nextLine();

        System.out.print(" - Age: ");
        manager.Age = sc.nextInt();

        System.out.print(" - Salary: ");
        manager.Salary = sc.nextFloat();
        
        sc.nextLine();
        System.out.print(" - Department: ");
        manager.Department = sc.nextLine();

        System.out.println("\n--- OUTPUT ---");
        manager.DisplayDetails();
    }
}