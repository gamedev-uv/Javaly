/*
WAP in Java to create Employee, Manager, Developer, and Clerk. 
Override calculateSalary() and demonstrate runtime polymorphism using Employee references.
*/

abstract class Employee
{
    public abstract float calculateSalary();
}

class Manager extends Employee
{
    @Override
    public float calculateSalary()
    {
        return 1000;
    }
}

class Developer extends Employee
{
    @Override
    public float calculateSalary()
    {
        return 500;
    }
}

class Clerk extends Employee
{
    @Override
    public float calculateSalary()
    {
        return 100;
    }
}

class EmployeePoly
{
    public static void main(String args[])
    {
        Employee[] employees = new Employee[] { 
            new Clerk(),
            new Manager(),
            new Developer()
        };

        System.out.println("--- [OUTPUT] ---");
        for(int i = 0; i < employees.length; i++)
            System.out.println(employees[i].calculateSalary());
    }
}