//WAP in Java to determine whether one string is a rotation of another.

import java.util.Scanner; 

class StringRotation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String originalStr, testStr;

        System.out.println("--- INPUT ---");
        System.out.print(" - Original String: ");
        originalStr = sc.next();

        System.out.print(" - Test String: ");
        testStr = sc.next();

        String combinations = (originalStr + originalStr);

        System.out.println("\n--- OUTPUT ---");
        if(combinations.indexOf(testStr) != -1)
            System.out.println(" It is a rotation");
        else 
            System.out.println(" It is not a rotation");
    }
}