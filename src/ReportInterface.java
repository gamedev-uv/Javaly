/*
WAP in Java to create Printable and Calculable interfaces. 
Implement both in Report to calculate total/average and print the report.
*/

import java.util.Scanner;

interface Printable 
{
    public void print();
}

interface Calculable 
{
    public void calculate();
}

class Report implements Printable, Calculable
{
    public int Count;
    public float Total, Average;

    public void calculate()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Count: ");
        Count = sc.nextInt();

        Total = 0;
        for(int i = 0; i < Count; i++)
        {
            System.out.print(" - Value " + (i + 1) + " : ");
            Total += sc.nextInt();
        }

        Average = Total / Count;
    }

    public void print()
    {
        System.out.println("Report Summary for " + Count + " Values");
        System.out.println("Total: " + Total);    
        System.out.println("Average: " + Average);    
    }
}

class ReportInterface 
{
    public static void main(String args[])
    {
        Report report = new Report();

        System.out.println("--- [INPUT] ---");
        report.calculate();

        System.out.println("\n--- [OUTPUT] ---");
        report.print();
    }
}