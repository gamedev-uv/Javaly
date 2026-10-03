//WAP in Java to accept two integers and perform division. Handle division by zero and invalid input.

import java.util.Scanner;

class SafeDivision
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("--- INPUT ---");

        try
        {
            System.out.print(" - Enter A: ");
            a = sc.nextInt();

            System.out.print(" - Enter B: ");
            b = sc.nextInt();

            System.out.println("\n--- OUTPUT ---");
            System.out.println(a + " / " + b + " = " + (a / b));
        }
        catch(ArithmeticException exception)
        {
            System.out.println(exception.toString());
            return;
        }
    }
}