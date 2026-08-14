/*
WAP in Java to initialize an array of n elements and find the smallest and largest element and display them.
*/

import java.util.Scanner;

class ArrayMinMax
{
    private static void displayArray(int[] elements)
    {
        System.out.print("Elements: ");
        for(int i = 0; i < elements.length; i++)
            System.out.print(elements[i] + " ");

        System.out.println();
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT ---");
        System.out.print(" - Element Count: ");

        int n = sc.nextInt();
        int[] elements = new int[n];
        System.out.println("--- ENTER " + n + " ELEMENTS ---");

        for(int i = 0; i < n; i++)
        {
            System.out.print(" - Element at (" + i + "): ");
            elements[i] = sc.nextInt();
        }

        int min = elements[0];
        int max = elements[0];
        for(int i = 1; i < n; i++)
        {
            int element = elements[i];
            if(element < min) 
                min = element;
            
            if(element > max)
                max = element;
        }

        System.out.println("\n--- OUTPUT ---");
        displayArray(elements);
        System.out.println("Min: " + min + " Max: " + max);
    }
}