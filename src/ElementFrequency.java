//WAP in Java to accept an integer array and determine how many times each distinct element occurs. 

import java.util.Scanner;

class ElementFrequency
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
        System.out.println("--- ENTER " + n + " ELEMENTS ---");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" - Element at (" + i + "): ");
            array[i] = sc.nextInt();
        }

        System.out.println("\n--- OUTPUT ---");
        DisplayArray(array);

        System.out.println("\n-- Frequency --");
        int[] visitCount = new int[n];
        for(int i = 0; i < n; i++)
        {
            if(visitCount[i] != 0) continue;

            visitCount[i] = 1;
            int value = array[i];

            for(int j = 0; j < n; j++)
            {
                if(i == j || visitCount[j] != 0) continue;
                if(array[j] != value) continue;

                visitCount[i]++;
                visitCount[j] = visitCount[i]; 
            }

            System.out.println(value + " occurs " + visitCount[i] + " times");
        }
    }
}