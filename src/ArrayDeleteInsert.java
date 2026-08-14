/*
WAP in Java to create an array of 10 elements and perform the following tasks -
- Delete the 6th elements
- Insert a new element in the 8th position

Ensure to display the array after each operation. Values should be input from user.
*/

import java.util.Scanner;

class ArrayOperations
{
    private static void displayArray(int[] elements, int n)
    {
        System.out.print("\nElements: ");
        for(int i = 0; i < n; i++)
            System.out.print(elements[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] elements = new int[n];

        System.out.println("--- ENTER 10 ELEMENTS ---");
        for(int i = 0; i < n; i++)
        {
            System.out.print(" - Element at (" + i + "): ");
            elements[i] = sc.nextInt();
        }

        displayArray(elements, n);

        System.out.print("\nDeleted 6th element");
        for(int i = 5; i < n - 1; i++)
            elements[i] = elements[i + 1];
        n--;
        displayArray(elements, n);

        System.out.print("\nEnter the new element: ");
        int newE = sc.nextInt();

        for(int i = 7; i < n - 1; i++)
            elements[i + 1] = elements[i];
        elements[7] = newE;
        n++;

        System.out.print("Inserted " + newE + " into 8th positon");
        displayArray(elements, n);
    }
}