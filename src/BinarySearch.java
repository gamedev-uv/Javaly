//WAP in Java to input an array from the user and perform binary search to find an element in it

import java.util.Scanner;

class BinarySearch
{
    static int indexOf(int[] a, int x)
    {
        int length = a.length;
        int l = 0, h = length - 1;

        while(l <= h)
        {
            int m = l + (h - l) / 2;
            int mE = a[m];

            if(x == mE) return m;
            if(x < mE) h = m - 1;
            else l = m + 1;
        }

        return -1;
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

        int x;
        System.out.print(" - Element to be searched: ");
        x = sc.nextInt();
        int index = indexOf(a, x);

        System.out.println("\n--- OUTPUT ---");
        if(index == -1)
            System.out.println(x + " wasn't found in the array");
        else 
            System.out.println(x + " was found at index " + index);
    }
}