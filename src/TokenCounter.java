/* 
WAP in Java to accept a sentence from the user and count the number of
vowels, consonants, digits, spaces, and special characters present in the string.
*/

import java.util.Scanner;

class TokenCounter
{
    static String Vowels = "AEIOUaeiou";

    static boolean isAlphabet(char ch)
    {
        return (ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z');
    }

    static boolean isDigit(char ch)
    {
        return ch >= '0' && ch <= '9';
    }

    static boolean isVowel(char ch)
    {
        for(int i = 0; i < 10; i++)
            if(Vowels.charAt(i) == ch) return true;
        
        return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" Enter string: ");
        String input = sc.nextLine();

        int len = input.length();
        int vCount = 0, cCount = 0;
        int dCount = 0, sCount = 0, sPCount = 0;
        for(int i = 0; i < len; i++)
        {
            char ch = input.charAt(i);

            if(isAlphabet(ch))
            {
                if(isVowel(ch))
                    vCount++;
                else
                    cCount++;

                continue;
            }
            
            if(isDigit(ch))
                dCount++;
            else if(ch == ' ')
                sCount++;
            else 
                sPCount++;
        }

        System.out.println("\n--- OUTPUT ---");
        System.out.println(" Vowel Count: " + vCount);
        System.out.println(" Consonant Count: " + cCount);
        System.out.println(" Digit Count: " + dCount);
        System.out.println(" Space Count: " + sCount);
        System.out.println(" Special Character Count: " + sPCount);
    }
}