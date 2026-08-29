/*
WAP in Java to create a string and perform the following operations:
- Find the length of the string.
- Convert the string to uppercase and lowercase.
- Display the character at a user-specified position.
- Extract a substring from the given string.
*/

import java.util.Scanner;

class StringOperations
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.print("Enter the string: ");
            String str = sc.nextLine();

            System.out.println("--- OPERATIONS ---");
            System.out.println(" 1 -> Length ");
            System.out.println(" 2 -> To Uppercase");
            System.out.println(" 3 -> To Lowercase");
            System.out.println(" 4 -> Character at");
            System.out.println(" 5 -> Substring");
            System.out.println(" 6 -> Exit");
            System.out.print("  - Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.println("Length: " + str.length());
                break;

                case 2:
                    System.out.println("Uppercase: " + str.toUpperCase());
                break;

                case 3:
                    System.out.println("Lowercase: " + str.toLowerCase());
                break;

                case 4:
                    System.out.print(" - Index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Char at " + index + ": " + str.charAt(index));
                break;

                case 5:
                    System.out.print(" - Starting Index: ");
                    int sIndex = sc.nextInt();

                    System.out.print(" - End Index: ");
                    int eIndex = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Substring: " + str.substring(sIndex, eIndex));
                break;

                case 6: return;
            }
            
            System.out.println();
        }
    }   
}