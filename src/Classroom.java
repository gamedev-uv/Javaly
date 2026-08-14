/*
WAP in Java to create a class called Classroom with instance variables className and students (an array of strings).
Implement a parameterized constructor that initializes these variables. 
Print the values of the variables.
*/

import java.util.Scanner;

class Classroom
{
    public Classroom(String className, String[] students)
    {
        this.className = className;
        this.students = students;
    }

    private String className;
    private String[] students;

    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Class name: ");
        String className = sc.nextLine();

        System.out.print(" - Student Count: ");

        int n = sc.nextInt();
        sc.nextLine();
        String names[] = new String[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("  - Student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        Classroom classRoom = new Classroom(className, names);

        System.out.println("\n--- OUTPUT ---");
        System.out.println(" - Class name : " + classRoom.className);
        System.out.println(" - Students");
        for(int i = 0; i < classRoom.students.length; i++)
        {
            System.out.println("    - " + classRoom.students[i]);
        }
    }
}