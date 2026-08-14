/*
WAP in Java to create a class called Dog with instance variables name and color.
Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
Print the values of the variables.
*/

import java.util.Scanner;

class Dog
{
    public Dog(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    private String name, color;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Name: ");
        String name = sc.next();

        System.out.print(" - Color: ");
        String color = sc.next();

        Dog dog = new Dog(name, color);
        System.out.println("\n--- OUTPUT ---");
        System.out.println(" - Name : " + dog.name);
        System.out.println(" - Color: " + dog.color);
    }
}