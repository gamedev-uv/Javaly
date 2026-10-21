/*
WAP in Java to create Person with name and age. 
Derive Student with roll number and course.
*/

import java.util.Scanner;

class Person 
{
    public String Name;
    public int Age;
}

class Student extends Person 
{
    public int RollNumber;
    public String CourseName;
}

class PersonStudent 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("--- INPUT ---");
        
        System.out.print(" - Name: ");
        student.Name = sc.nextLine();

        System.out.print(" - Age: ");
        student.Age = sc.nextInt();
        
        System.out.print(" - Roll Number: ");
        student.RollNumber = sc.nextInt();

        sc.nextLine();
        System.out.print(" - Course Name: ");
        student.CourseName = sc.nextLine();

        System.out.println("\n--- OUTPUT ---");
        System.out.println(" - Name       : " + student.Name);
        System.out.println(" - Age        : " + student.Age);
        System.out.println(" - Roll No    : " + student.RollNumber);
        System.out.println(" - Course Name: " + student.CourseName);
    }
}