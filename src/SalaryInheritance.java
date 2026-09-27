/*
WAP in Java to create a superclass Employee containing
employeeId, name, and basicSalary.

Create subclasses Developer and Manager. Override a method calculateSalary() in both subclasses by
adding different allowances. Display the final salary of each employee.
*/

class Employee
{
    public String name;
    public String employeeId;
    public float basicSalary;

    public float calculateSalary()
    {
        return basicSalary;
    }
}

class Developer extends Employee
{
    @Override
    public float calculateSalary()
    {
        return basicSalary + 1000;
    }
}

class Manager extends Employee
{
    @Override
    public float calculateSalary()
    {
        return basicSalary + 2000;
    }
}

class SalaryInheritance
{
    public static void main(String args[])
    {
        Developer developer = new Developer();
        developer.name = "Yuvraj Bhowmik";
        developer.employeeId = "SDEV03";
        developer.basicSalary = 100;

        Manager manager = new Manager();
        manager.name = "Mr. Ludford";
        manager.employeeId = "SM012";
        manager.basicSalary = 500;

        System.out.println("--- OUTPUT ---");
        System.out.println("Developer Salary: " + developer.calculateSalary());
        System.out.println("Manager Salary  : " + manager.calculateSalary());
    }
}