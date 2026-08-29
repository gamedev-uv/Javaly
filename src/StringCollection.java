/*
WAP in Java to store n strings in a String array and perform the following operations: 
- Display all strings. 
- Find the longest string. 
- Find the shortest string.
- Display the strings in reverse order
*/

import java.util.Scanner;

class StringCollection
{
    static int getLongestStringIndex(String[] strings)
    {
        int maxIndex = -1;
        int maxLength = 0;

        for(int i = 0; i < strings.length; i++)
        {
            String str = strings[i];
            int len = str.length();
            if(len <= maxLength) continue;

            maxLength = len;
            maxIndex = i;
        }

        return maxIndex;
    }

    static int getShortestStringIndex(String[] strings)
    {
        int minIndex = 0;
        int minLength = strings[0].length();

        for(int i = 1; i < strings.length; i++)
        {
            String str = strings[i];
            int len = str.length();
            if(len >= minLength) continue;

            minLength = len;
            minIndex = i;
        }

        return minIndex;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("--- INPUT ---");
        System.out.print(" - String Count (N): ");
        n = sc.nextInt();
        sc.nextLine();

        String[] strings = new String[n];
        System.out.println(" -- Enter Elements --");
        for(int i = 0; i < n; i++)
        {
            System.out.print("  - Enter String#" + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }

        System.out.println("\n--- OUTPUT ---");

        System.out.println(" -- STRINGS --");
        for(int i = 0; i < n; i++)
            System.out.println("  " + strings[i]);

        System.out.println("\n -- LONGEST STRING --");
        String longest = strings[getLongestStringIndex(strings)];
        System.out.println("  " + longest);

        System.out.println("\n -- SHORTEST STRING --");
        String shortest = strings[getShortestStringIndex(strings)];
        System.out.println("  " + shortest);

        System.out.println("\n -- REV STRINGS --");
        for(int i = 0; i < n; i++)
        {
            String str = strings[i];
            int len = str.length();

            System.out.print("  ");
            for(int j = len - 1; j >= 0; j--)
                System.out.print(str.charAt(j));

            System.out.println();
        }
    }
}