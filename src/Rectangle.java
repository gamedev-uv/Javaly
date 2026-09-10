//WAP in Java to create a Rectangle class with length and breadth and methods for area and perimeter.

import java.util.Scanner;

public class Rectangle
{
    public Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    float length, breadth;

    public float getPerimeter()
    {
        return 2 * (length + breadth);
    }

    public float getArea()
    {
        return length * breadth;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Length: ");
        float length = sc.nextFloat();

        System.out.print(" - Breadth: ");
        float breadth = sc.nextFloat();

        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("\n--- OUTPUT ---");
        System.out.println(" - Perimeter: " + rectangle.getPerimeter());
        System.out.println(" - Area     : " + rectangle.getArea());
    }
}