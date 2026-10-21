/*
WAP in Java to create Vehicle with registration number and brand.
Derive Car and Bike with one additional property each.
*/

import java.util.Scanner;

class Vehicle 
{
    public int RegistrationNumber;
    public String Brand;
}

class Car extends Vehicle
{
    public int SeatCount;
}

class Bike extends Vehicle
{
    public boolean HasABS;
}

class VehicleManager
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Car car = new Car();
        Bike bike  = new Bike();

        System.out.println("--- INPUT ---");
        System.out.println("-- Enter Car Details --");

        System.out.print(" - Registration No: ");
        car.RegistrationNumber = sc.nextInt();

        sc.nextLine();
        System.out.print(" - Brand: ");
        car.Brand = sc.nextLine();

        System.out.print(" - Seat Count: ");
        car.SeatCount = sc.nextInt();

        System.out.println("-- Enter Bike Details --");
        System.out.print(" - Registration No: ");
        bike.RegistrationNumber = sc.nextInt();

        sc.nextLine();
        System.out.print(" - Brand: ");
        bike.Brand = sc.nextLine();

        System.out.print(" - Has Abs: ");
        bike.HasABS = sc.nextBoolean();

        System.out.println("\n--- OUTPUT ---");
        System.out.println("-- Car Details --");
        System.out.println(" - Registration No: " + car.RegistrationNumber);
        System.out.println(" - Brand          : " + car.Brand);
        System.out.println(" - SeatCount      : " + car.SeatCount);

        System.out.println("\n-- Bike Details --");
        System.out.println(" - Registration No: " + bike.RegistrationNumber);
        System.out.println(" - Brand          : " + bike.Brand);
        System.out.println(" - Has ABS        : " + bike.HasABS);
    }
}