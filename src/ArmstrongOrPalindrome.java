/*
WAP in Java to check whether a number n is Armstrong or Palindrome.
*/

import java.util.Scanner;

class ArmstrongOrPalindrome
{
    private static int getDigitCount(int n)
    {
        int c = 0;
        while(n > 0)
        {
            c++;
            n /= 10;
        }

        return c;
    }

    private static boolean isArmstrong(int n)
    {
        int digitCount = getDigitCount(n);
        int sum = 0;

        for(int t = n; t > 0; t /= 10)
            sum += Math.pow(t % 10, digitCount);

        return sum == n;
    }

    private static boolean isPalindrome(int n)
    {
        int rev = 0;
        
        for(int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;

        return rev == n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT ---");
        System.out.print(" - n: ");
        int n = sc.nextInt();

        System.out.println("\n--- OUTPUT ---");
        System.out.println(n + " is an Armstrong number? " + isArmstrong(n));
        System.out.println(n + " is a Palindrome number? " + isPalindrome(n));
    }
}