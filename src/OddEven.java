//WAP in Java to check whether a given number is odd even or zero

import java.util.Scanner;

class OddEven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Enter the number: ");
        int n = sc.nextInt();

        System.out.println("\n--- OUTPUT ---");
        if(n == 0)
            System.out.println(n + " is zero");
        else if(n % 2 == 0)
            System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");
    }
}