//WAP in Java to display the multiplication table of given number n

import java.util.Scanner;

class MultiplicationTable
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Enter the number: ");
        int n = sc.nextInt();

        System.out.println("\n--- OUTPUT ---");
        for(int i = 1; i <= 10; i++)
           System.out.println(n + " * " + i + " = " + (n * i));
    }
}