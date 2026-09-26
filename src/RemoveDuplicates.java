//WAP in Java to create another String after removing duplicate characters from the input.

import java.util.Scanner;

class RemoveDuplicates
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - String: ");
        String str = sc.next();

        int length = str.length();
        char[] distinctChars = new char[length];

        int index = 0;
        boolean exists = false;
        for(int i = 0; i < length; i++)
        {
            char ch = str.charAt(i);
            exists = false;
            
            for(int j = 0; j <= index; j++)
            {
                if(distinctChars[j] == ch) 
                {
                    exists = true;
                    break;
                }
            }

            if(exists) continue;
            distinctChars[index++] = ch;
        }

        String newStr = new String(distinctChars);
        System.out.println("\n--- OUTPUT ---");
        System.out.println(" Old String: " + str);
        System.out.println(" New String: " + newStr);
    }
}