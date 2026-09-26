//WAP in Java to accept n integers and find the second-largest element without sorting the array. 

import java.util.Scanner;

class SecondLargest
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
        System.out.println("--- ENTER " + n + " ELEMENTS ---");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" - Element at (" + i + "): ");
            elements[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) 
        {
            if (elements[i] > largest)
            {
                secondLargest = largest;
                largest = elements[i];
            } 
            else if (elements[i] > secondLargest && elements[i] != largest) 
            {
                secondLargest = elements[i];
            }
        }

        System.out.println("\n--- OUTPUT ---");
        DisplayArray(elements);

        if(secondLargest != Integer.MIN_VALUE)
            System.out.println(" - Second Largest Element: " + secondLargest);
        else
            System.out.println(" - No distinct second largest number");
    }
}