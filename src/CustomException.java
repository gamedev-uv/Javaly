//WAP in Java to create InvalidMarksException. Throw it when marks are outside 0–100

import java.util.Scanner;

class InvalidMarksException extends RuntimeException
{
    public InvalidMarksException(int marks)
    {
        super(marks + " is not valid as it is not between 0 and 100");
    }
}

class CustomException
{
    public static void main(String args[]) throws InvalidMarksException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Enter marks: ");
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100)
            throw new InvalidMarksException(marks);
        else 
            System.out.println("--- OUTPUT ---\nValid marks");
    }
}