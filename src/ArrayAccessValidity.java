//WAP in Java accept an array and index. Display the element and handle invalid indices.

import java.util.Scanner;

class ArrayAccessValidity
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("--- INPUT ---");
        System.out.print(" - Enter N: ");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.println(" - Enter elements -");
        for(int i = 0; i < n; i++)
        {
            System.out.print("   - Element at " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print(" - Enter Index: ");
        int index = sc.nextInt();

        try
        {
            System.out.println("Element at " + index + ": " + a[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}