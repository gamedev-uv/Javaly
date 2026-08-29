/*
WAP in menu driven program in Java to perform the following operations on an integer array: 
- Create and display an array.  
- Insert an element at a specified position. 
- Delete an element from a specified position.   
- Search for a given element.  
- Sort the array in ascending order.  
- Exit the program.  
*/

import java.util.Scanner;

class ArrayMenu
{
    static void displayArray(int[] array)
    {
        System.out.print("Array: [");

        int n = array.length;
        for(int i = 0; i < n - 1; i++)
            System.out.print(array[i] + ", ");

        System.out.print(array[n - 1] + "]");
        System.out.println();
    }

    static int[] insertElement(int[] source, int position, int value)
    {
        int n = source.length;
        int tIndex = position - 1;

        if(tIndex < 0 || tIndex >= n)
        {
            System.out.println("Coudln't insert at position " + position);
            return source;
        }

        int[] dest = new int[n + 1];
        for(int i = 0; i < tIndex; i++)
            dest[i] = source[i];

        dest[tIndex] = value;

        for(int i = tIndex + 1; i < n + 1; i++)
            dest[i] = source[i - 1];

        return dest;
    }

    static int[] deleteElement(int[] source, int position)
    {
        int n = source.length;
        int tIndex = position - 1;
        
        if(tIndex < 0 || tIndex >= n)
        {
            System.out.println("Coudln't delete at position " + position);
            return source;
        }

        int[] dest = new int[n - 1];
        for(int i = 0; i < n - 1; i++)
        {
            if(i < tIndex) 
                dest[i] = source[i];
            else
                dest[i] = source[i + 1];
        }

        return dest;
    }

    static int searchItem(int[] source, int target)
    {
        int n = source.length;
        for(int i = 0; i < n; i++)
            if(source[i] == target) return i;

        return -1;
    }

    static int[] sortArray(int[] source)
    {
        int n = source.length;
        int[] dest = new int[n];

        for(int i = 0; i < n; i++)
        {
            int smallest = source[i];
            int index = i;

            for(int j = i + 1; j < n; j++)
            {
                if(source[j] > smallest) continue;
                smallest = source[j];
                index = j;
            }

            dest[i] = smallest;
            source[index] = source[i];
        }
        
        return dest;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("--- INPUT ---");
        System.out.print(" - Length(n): ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("\n--- Enter elements ---");
        for(int i = 0; i < n; i++)
        {   
            System.out.print(" - Element at " + i + ": ");
            arr[i] = sc.nextInt();
        }

        displayArray(arr);

        while(true)
        {
            System.out.println("\n--- OPERATIONS ---");
            System.out.println("1 -> Insert Element");
            System.out.println("2 -> Delete Element");
            System.out.println("3 -> Search Element");
            System.out.println("4 -> Sort Array");
            System.out.println("5 -> Exit");
            System.out.print(" - Choice: ");

            int choice = sc.nextInt();
            int value, position;

            switch(choice)
            {
                case 1:

                    System.out.print(" - Value: ");
                    value = sc.nextInt();

                    System.out.print(" - Position: ");
                    position = sc.nextInt();

                    arr = insertElement(arr, position, value);
                    displayArray(arr);
                break;

                case 2:
                    System.out.print(" - Position: ");
                    position = sc.nextInt();

                    arr = deleteElement(arr, position);
                    displayArray(arr);
                break;
            
                case 3:
                    System.out.print(" - Value: ");
                    value = sc.nextInt();

                    int fIndex = searchItem(arr, value);
                    if(fIndex == -1)
                        System.out.println("Value " + value + " was not found");
                    else
                        System.out.println("Value " + value + " was found at index: " + fIndex);
                break;

                case 4:
                    arr = sortArray(arr);
                    displayArray(arr);
                break;

                case 5:
                default:
                    System.out.print("\nFinal ");
                    displayArray(arr);
                return;
            }
        }
    }
}