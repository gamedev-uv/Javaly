//WAP in Java to perform division while appropriately handling invalid numeric input, division by zero, and other runtime problems

import java.util.Scanner;

class GenericExceptions
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
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}