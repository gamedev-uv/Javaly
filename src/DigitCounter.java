//WAP in Java to input a number and count the number of digits in it

import java.util.Scanner;

class DigitCounter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT ---");
        System.out.print(" - N: ");
        int n = sc.nextInt();

        int dC = 0;
        for(int t = n; t != 0; t /= 10, dC++);

        System.out.println("\n--- OUTPUT ---");
        System.out.println(" Digit Count(" + n + "): " + dC);
    }
}