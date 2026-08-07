//WAP in Java to find the maximum between 3 given numbers.

import java.util.Scanner;

class Max3
{
    static int max(int a, int b)
    {
        return a > b ? a : b;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("--- INPUT ---");
        System.out.print(" - A: ");
        a = sc.nextInt();

        System.out.print(" - B: ");
        b = sc.nextInt();

        System.out.print(" - C: ");
        c = sc.nextInt();

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Maximum: " + max(max(a, b), c));
    }
}