//WAP in Java to accept n and calculate 1 + 2 + ... + n using a loop.

import java.util.Scanner;

class SumTillN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT ---");
        System.out.print(" - N: ");
        int n = sc.nextInt();

        int sum = 1;
        for(int i = 2; i <= n; i++)
            sum += i;

        System.out.println("\n--- OUTPUT ---");
        System.out.println(" Sum: " + sum);
    }
}