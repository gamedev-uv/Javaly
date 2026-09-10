//WAP in Java to create a Circle class with radius, a constructor, and methods for area and circumference

import java.util.Scanner;

class Circle
{
    public Circle(float radius)
    {
        Radius = radius;
    }

    public float Radius;

    float getCircumference()
    {
        return 2 * (float)Math.PI * Radius;
    }

    float getArea()
    {
        return (float)(Math.PI * Math.pow(Radius, 2));
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Radius: ");
        float radius = sc.nextFloat();

        Circle circle = new Circle(radius);
        System.out.println("\n--- OUTPUT ---");
        System.out.println(" - Circumference: " + circle.getCircumference());
        System.out.println(" - Area         : " + circle.getArea());
    }
}