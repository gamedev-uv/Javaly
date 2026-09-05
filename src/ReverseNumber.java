//WAP in Java to reverse an integer without converting it into a String.

import java.util.Scanner;

class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT ---");
        System.out.print(" - N: ");
        int n = sc.nextInt();

        int rev = 0;
        for(int t = n; t > 0; t /= 10)
            rev = rev * 10 + t % 10;

        System.out.println("\n--- OUTPUT ---");
        System.out.println(" Reverse(" + n + "): " + rev);
    }
}