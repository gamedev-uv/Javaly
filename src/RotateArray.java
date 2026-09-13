//WAP in Java to an array to the right by k positions.

import java.util.Scanner;

class RotateArray
{
    private static void DisplayArray(int[] array)
    {
        System.out.print("Elements: ");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - N: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        int evenCount = 0;
        System.out.println("--- ENTER " + n + " array ---");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" - Element at (" + i + "): ");
            array[i] = sc.nextInt();
            if(array[i] % 2 == 0) evenCount++;
        }

        System.out.print(" - k: ");
        int k = sc.nextInt();
        k %= n;

        int[] rArray = new int[n];
        for(int i = 0; i < n; i++)
            rArray[(i + k) % n] = array[i];

        System.out.println("\n--- OUTPUT ---");
        System.out.print(" - Original ");
        DisplayArray(array);

        System.out.print(" - Rotated ");
        DisplayArray(rArray);
    }
}