//WAP in Java to swap 2 given numbers.

import java.util.Scanner;

class SwapNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("--- INPUT ---");
        System.out.print(" - A: ");
        a = sc.nextInt();

        System.out.print(" - B: ");
        b = sc.nextInt();

        int t = b;
        b = a;
        a = t;

        System.out.println("\n--- OUTPUT ---");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}