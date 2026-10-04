//WAP in Java to input an array from the user and perform bubble sort to sort the array.

import java.util.Scanner;

class BubbleSort
{
    static void displayArray(int[] a)
    {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        
        System.out.println();
    }

    static int[] bubbleSort(int[] a)
    {
        int length = a.length;

        for(int i = 0; i < length; i++)
        {
            for(int j = 0; j < length - 1 - i; j++)
            {
                if(a[j] <= a[j + 1]) 
                    continue;

                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }

        return a;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("--- INPUT ---");
        System.out.print(" - Enter N: ");
        n = sc.nextInt();

        int[] a = new int[n];
        System.out.println(" - Enter Elements - ");
        for(int i = 0; i < n; i++)
        {
            System.out.print("  - Elements " + i + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("\n--- OUTPUT ---");
        System.out.print(" Original: ");
        displayArray(a);

        System.out.print(" Sorted  : ");
        displayArray(bubbleSort(a));
    }
}