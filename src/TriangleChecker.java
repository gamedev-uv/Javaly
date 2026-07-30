//WAP in Java to check whether a given triangle is equilateral, isoceles or scalene

import java.util.Scanner;

class TriangleChecker
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int s1, s2, s3;

        System.out.println("--- INPUT ---");
        System.out.print(" - Enter 1st Side's Length: ");
        s1 = sc.nextInt();

        System.out.print(" - Enter 2nd Side's Length: ");
        s2 = sc.nextInt();

        System.out.print(" - Enter 3rd Side's Length: ");
        s3 = sc.nextInt();

        System.out.println("\n--- OUTPUT ---");
        if(s1 == s2 && s2 == s3)
            System.out.println("Equilateral Traingle");
        else if(s1 != s2 && s1 != s3 && s2 != s3)
            System.out.println("Scalene Traingle");
        else
            System.out.println("Isoceles Traingle");
    }
}