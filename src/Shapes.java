/*
WAP in Java to create a superclass Shape with a method display().
Create two subclasses Circle and Rectangle that
calculate and display their respective areas.
*/

import java.util.Scanner;

class Shape
{
    public void display() {}
}

class Circle extends Shape
{
    public float Radius;

    @Override
    public void display()
    {
        System.out.println("Circle Area   : " + (float)(Math.PI * Radius * Radius));
    }
}

class Rectangle extends Shape
{
    public float Length, Breadth;

    @Override
    public void display()
    {
        System.out.println("Rectangle Area: " + (Length * Breadth));
    }
}

class Shapes
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();     

        System.out.println("--- INPUT ---");
        System.out.println(" - Circle - ");
        System.out.print("   Radius: ");
        circle.Radius = sc.nextFloat();

        System.out.println();
        System.out.println(" - Rectangle - ");
        System.out.print("   Length: ");
        rectangle.Length = sc.nextFloat();

        System.out.print("   Breadth: ");
        rectangle.Breadth = sc.nextFloat();

        System.out.println("\n--- OUTPUT ---");
        circle.display();
        rectangle.display();
    }
}