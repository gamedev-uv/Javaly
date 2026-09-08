/*
WAP in Java to accept two strings and determine whether they are anagrams of each other.
*/

import java.util.Scanner;

class AnagramChecker
{
    static boolean isAnagram(String s1, String s2)
    {
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2) return false;

        for(int i = 0; i < len1; i++)
        {
            char ch = s1.charAt(i);
            int index = s2.indexOf(ch);
            if(index == -1) 
                return false;

            StringBuffer buffer = new StringBuffer(s2);
            buffer.setCharAt(index, '#');
            s2 = buffer.toString();
        }

        return true;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s1, s2;
        System.out.println("--- INPUT ---");
        System.out.print(" Enter 1st: ");
        s1 = sc.next();

        System.out.print(" Enter 2nd: ");
        s2 = sc.next();

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Anagrams? : " + isAnagram(s1, s2));
    }
}