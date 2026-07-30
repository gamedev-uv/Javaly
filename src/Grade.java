/*
WAP in Java to give grade based on the marks. 

Marks
> 90  -> Outstanding 
> 80  -> Excellent
60-80 -> Average
40-60 -> Below Average
< 40  -> Fail
*/

import java.util.Scanner;

class Grade
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Enter Marks: ");
        float marks = sc.nextFloat();

        System.out.println("\n--- OUTPUT ---");
        if(marks > 90)
            System.out.println("Outstanding");
        else if(marks > 80)
            System.out.println("Excellent");
        else if(marks > 60)
            System.out.println("Average");
        else if(marks >= 40)
            System.out.println("Below Average");
        else
            System.out.println("Fail");
    }
}