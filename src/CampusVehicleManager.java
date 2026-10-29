import java.util.Scanner;
import java.util.ArrayList;

abstract class Vehicle
{
    public Vehicle(String vehicleId, String vehicleName, float maxSpeed)
    {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.maxSpeed = maxSpeed;
    }

    public String vehicleId;
    public String vehicleName;
    public float maxSpeed;

    public void displayInfo()
    {
        System.out.println("\n--- Vehicle Details ---");
        System.out.println(" - ID:               " + vehicleId);
        System.out.println(" - Name:             " + vehicleName);
        System.out.println(" - Max Speed:        " + maxSpeed);
        System.out.println(" - Maintenance Cost: " + calculateMaintenanceCost());
    }

    public abstract float calculateMaintenanceCost();
}

class Bus extends Vehicle 
{
    public Bus(String vehicleId, String vehicleName, float maxSpeed, int seatingCapacity)
    {
        super(vehicleId, vehicleName, maxSpeed);
        this.seatingCapacity = seatingCapacity;
    }

    public int seatingCapacity;

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println(" - Capacity:         " + seatingCapacity);
    }

    @Override
    public float calculateMaintenanceCost()
    {
        return seatingCapacity * 100;
    }
}

class ElectricCart extends Vehicle 
{
    public ElectricCart(String vehicleId, String vehicleName, float maxSpeed, float batteryCapacity)
    {
        super(vehicleId, vehicleName, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public float batteryCapacity;

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println(" - Capacity:         " + batteryCapacity + "mAh");
    }

    @Override
    public float calculateMaintenanceCost()
    {
        return batteryCapacity * 50;
    }
}

class PatrolCar extends Vehicle 
{
    public PatrolCar(String vehicleId, String vehicleName, float maxSpeed, float patrolHours)
    {
        super(vehicleId, vehicleName, maxSpeed);
        this.patrolHours = patrolHours;
    }

    public float patrolHours;

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println(" - Patrol Time:      " + patrolHours + " hours");
    }

    @Override
    public float calculateMaintenanceCost()
    {
        return patrolHours * 75;
    }
}

class CampusVehicleManager 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- [INPUT] ---");
        System.out.print(" - Enter Vehicle Count: ");
        int vehicleCount = sc.nextInt();

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(vehicleCount);
        for(int i = 0; i < vehicleCount; i++)
        {
            System.out.println("\n--- Vehicle " + (i + 1) + "/" + vehicleCount + " ---");
            System.out.println("-- Select Vehicle Type --");
            System.out.println(" - 0. Bus");
            System.out.println(" - 1. Electric Cart");
            System.out.println(" - 2. Patrol Car");
            System.out.print(" - Choice: ");
            int vehicleType = sc.nextInt();
            sc.nextLine();

            if(vehicleType < 0 || vehicleType > 2)
            {
                System.out.println(" -> Invalid Vehicle Type. Select Again!");
                i--;
                continue;
            }

            System.out.print(" - Vehicle ID: ");
            String vehicleId = sc.nextLine();

            System.out.print(" - Vehicle Name: ");
            String vehicleName = sc.nextLine();

            System.out.print(" - Max Speed: ");
            float maxSpeed = sc.nextFloat();

            switch(vehicleType)
            {
                case 0: 
                    System.out.print(" - Seating Capacity: ");
                    Bus bus = new Bus(vehicleId, vehicleName, maxSpeed, sc.nextInt());
                    vehicles.add(bus);
                    break;

                case 1: 
                    System.out.print(" - Battery Capacity: ");
                    ElectricCart ev_cart = new ElectricCart(vehicleId, vehicleName, maxSpeed, sc.nextFloat());
                    vehicles.add(ev_cart);
                    break;

                case 2:
                    System.out.print(" - Patrol Hours: ");
                    PatrolCar car = new PatrolCar(vehicleId, vehicleName, maxSpeed, sc.nextFloat());
                    vehicles.add(car);
                    break;
            }
        }

        for(int i = 0; i < vehicleCount; i++)
            vehicles.get(i).displayInfo();
    }
}