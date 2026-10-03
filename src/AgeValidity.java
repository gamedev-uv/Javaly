//WAP in Java to create validateAge(int age). If age is less than 18, generate an exception with an appropriate message

import java.util.Scanner;

class AgeValidity
{
    static void validateAge(int age) throws Exception
    {
        if(age < 18)
            throw new Exception("Must be above 18!");

        System.out.println("Age is valid");
    }

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("--- INPUT ---");
        System.out.print(" - Enter Age: ");
        age = sc.nextInt();

        System.out.println("\n--- OUTPUT ---");
        validateAge(age);
    }
}