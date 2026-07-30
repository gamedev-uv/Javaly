/*
WAP in Java to create a class TravelPackage with the following data members
- Travel Code : string
- NoOfAdults  : int
- NoOfKids    : int 
- Kilometers  : int 
- TotalFare   : float 

And the following member functions
- TravelPackage(): A constructor to assign default values as follows 
    TravelCode = "NULL"
    Other members have their default value of 0 or 0.0f
- AssignFare(): A method which calculates and assigns the fare 
    For one adult the pricing is as follows 
        500 for >= 1000 Kilometers
        300 for >= 500 and < 1000 Kilometers 
        200 for < 500 Kilometers
    For kids the fare is 50% of that of an adult
- EnterTour(): A method which will be used to input and assign values to the members
- ShowTour():  A method which will be used display the contents of all the members
*/

import java.util.Scanner;

class TravelPackage
{
    public TravelPackage()
    {
        TravelCode = "NULL";
    }

    String TravelCode;
    int NoOfAdults, NoOfKids;
    int Kilometers;
    float TotalFare;

    void EnterTour()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- INPUT ---");
        System.out.print(" - Travel Code: ");
        TravelCode = sc.next();

        System.out.print(" - Adult Count: ");
        NoOfAdults = sc.nextInt();

        System.out.print(" - Kid Count: ");
        NoOfKids = sc.nextInt();

        System.out.print(" - Kilometers: ");
        Kilometers = sc.nextInt();
    }

    void AssignFare()
    {
        float distancePrice = 0;
        if(Kilometers >= 1000)
            distancePrice = 500;
        else if(Kilometers >= 500)
            distancePrice = 300;
        else
            distancePrice = 200;
        
        TotalFare = (distancePrice * NoOfAdults) + (distancePrice / 2f * NoOfKids);
    } 

    void ShowTour()
    {
        System.out.println("\n--- OUTPUT ---");
        System.out.println("Travel Code: " + TravelCode);
        System.out.println("Adult Count: " + NoOfAdults);
        System.out.println("Kid Count  : " + NoOfKids);
        System.out.println("Distance   : " + Kilometers + "kms");
        System.out.println("Total Fare : Rs." + TotalFare);
    }
}

class TravelManager
{
    public static void main(String[] args)
    {
        TravelPackage pack = new TravelPackage();
        pack.EnterTour();
        pack.AssignFare();
        pack.ShowTour();
    }
}