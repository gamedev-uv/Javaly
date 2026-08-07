//WAP in Java to display the fibonacci sequence upto t terms.

import java.util.Scanner;

class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t;
        System.out.println("--- INPUT ---");
        System.out.print(" - No of terms(t): ");
        t = sc.nextInt();
        if(t <= 0) return;

        System.out.println("\n--- OUTPUT ---");
        System.out.print("Fibonacci Sequence: ");
        if(t >= 1) System.out.print("0 ");
        if(t >= 2) System.out.print("1 ");
        t -= 2;

        int a = 0, b = 1;
        for(int i = 0; i < t; i++)
        {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}