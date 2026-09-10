//WAP in Java to create a Student class with marks of three subjects. Calculate total, average, and display the output.

import java.util.Scanner;

class StudentMarksAvg
{
    float MarksA, MarksB, MarksC;

    float getTotal()
    {
        return MarksA + MarksB + MarksC;
    }

    float getAverage()
    {
        return getTotal() / 3f;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("--- INPUT ---");

        System.out.print(" - Marks in A: ");
        student.MarksA = sc.nextFloat();

        System.out.print(" - Marks in B: ");
        student.MarksB = sc.nextFloat();

        System.out.print(" - Marks in C: ");
        student.MarksC = sc.nextFloat();

        System.out.println("\n--- OUTPUT ---");
        System.out.println(" - Total  : " + student.getTotal());
        System.out.println(" - Average: " + student.getAverage());
    }
}