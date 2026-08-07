//WAP in Java to calculate the factorial of a given number n.

import java.util.Scanner;

class Factorial
{
    static int factorial(int n)
    {
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("--- INPUT ---");
        System.out.print(" - Enter n: ");
        n = sc.nextInt();

        System.out.println("\n--- OUTPUT ---");
        System.out.println(n + "! = " + factorial(n));
    }
}