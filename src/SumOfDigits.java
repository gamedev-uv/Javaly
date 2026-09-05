//WAP in Java to accept an integer and calculate the sum of its digits.

import java.util.Scanner;

class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT ---");
        System.out.print(" - N: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int t = n; t > 0; t /= 10)
            sum += t % 10;

        System.out.println("\n--- OUTPUT ---");
        System.out.println(" Sum Digits(" + n + "): " + sum);
    }
}