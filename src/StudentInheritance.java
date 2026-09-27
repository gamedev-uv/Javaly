/*
WAP in Java to create a superclass Person containing a variable name and a method display().
Create a subclass Student with its own name variable. Use the super keyword to access the superclass variable and method.
*/

import java.util.Scanner;

class Person 
{
    public String name;

    public void display()
    {
        System.out.println("Person Name:  " + name);
    }
}

class Student extends Person
{
    public String name;

    @Override
    public void display()
    {
        super.name = name + " [STUDENT]";
        super.display();
        System.out.println("Student Name: " + name);
    }
}

class StudentInheritance
{
    public static void main(String args[])
    {
        Student student = new Student();
        student.name = "@gamedev_uv";
        student.display();
    }
}