//WAP in Java to accept an array and create separate arrays for even and odd numbers. 

import java.util.Scanner;

class OddEvenSplitter
{
    private static void DisplayArray(int[] elements)
    {
        System.out.print("Elements: ");
        for(int i = 0; i < elements.length; i++)
            System.out.print(elements[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - N: ");
        int n = sc.nextInt();

        int[] elements = new int[n];
        int evenCount = 0;
        System.out.println("--- ENTER " + n + " ELEMENTS ---");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" - Element at (" + i + "): ");
            elements[i] = sc.nextInt();
            if(elements[i] % 2 == 0) evenCount++;
        }

        int[] evenElements = new int[evenCount];
        int[] oddElements = new int[n - evenCount];

        int eIndex = 0, oIndex = 0;
        for(int i = 0; i < n; i++)
        {
            int value = elements[i];
            if(value % 2 == 0) 
                evenElements[eIndex++] = value;
            else
                oddElements[oIndex++] = value;
        }

        System.out.println("\n--- OUTPUT ---");

        System.out.print(" - Original ");
        DisplayArray(elements);

        System.out.print(" - Even ");
        DisplayArray(evenElements);

        System.out.print(" - Odd ");
        DisplayArray(oddElements);
    }
}