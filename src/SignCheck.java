//WAP in Java to classify an input number as positive, negative, or zero.

import java.util.Scanner;

class SignCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT ---");
        System.out.print(" - N: ");
        int n = sc.nextInt();

        System.out.println("\n--- OUTPUT ---");
        System.out.print(n + " is ");
        if(n < 0) 
            System.out.print("negative");
        else if(n > 0) 
            System.out.print("positive");
        else 
            System.out.print("zero");
    }
}