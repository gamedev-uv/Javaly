//WAP in Java to input 2 numbers from the user and display their sum.

import java.util.Scanner;

class AddNumbers
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("--- INPUT ---\n");
        System.out.print(" - Enter the value of A: ");
        int a = sc.nextInt();

        System.out.print(" - Enter the value of B: ");
        int b = sc.nextInt();

        System.out.print("\n--- OUTPUT ---\n");
        System.out.print(a + " + " + b + " = " + (a + b));
    }
}