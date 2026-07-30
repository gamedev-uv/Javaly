/*
WAP in Java to create a class called Calculate. Which has separate methods with separate inputs for -
- Calculating the sum of 2 given numbers
- Calculate the minimum between 2 given numbers
- Check if 3 2-Dimensional points are colliner or not
*/

import java.util.Scanner;

class Calculate
{
    Calculate()
    {
        sc = new Scanner(System.in);
    }

    Scanner sc;

    int getSum()
    {
        int a, b;

        System.out.println("--- INPUT ---");
        System.out.print(" - Enter A: ");
        a = sc.nextInt();

        System.out.print(" - Enter B: ");
        b = sc.nextInt();

        return a + b;
    }

    int getMin()
    {
        int a, b;

        System.out.println("--- INPUT ---");
        System.out.print(" - Enter A: ");
        a = sc.nextInt();

        System.out.print(" - Enter B: ");
        b = sc.nextInt();

        return a > b ? b : a;
    } 

    float getSlope(float x1, float y1, float x2, float y2)
    {
        return (y2 - y1) / (x2 - x1);
    }

    boolean areCollinear()
    {
        float x1, y1;
        float x2, y2;
        float x3, y3;

        System.out.println("--- INPUT ---");
        System.out.println(" - Point A");
        System.out.print("      x: ");
        x1 = sc.nextFloat();

        System.out.print("      y: ");
        y1 = sc.nextFloat();

        System.out.println(" - Point B");
        System.out.print("      x: ");
        x2 = sc.nextFloat();

        System.out.print("      y: ");
        y2 = sc.nextFloat();

        System.out.println(" - Point C");
        System.out.print("      x: ");
        x3 = sc.nextFloat();

        System.out.print("      y: ");
        y3 = sc.nextFloat();

        return getSlope(x1, y1, x2, y2) == getSlope(x2, y2, x3, y3);
    } 
}

class Calculator
{
    public static void main(String args[])
    {
        Calculate calculate = new Calculate();
        System.out.println("Sum: " + calculate.getSum() + "\n");
        System.out.println("Minimum: " + calculate.getMin() + "\n");
        System.out.println("Collinear: " + calculate.areCollinear());
    }
}