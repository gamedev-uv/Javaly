//WAP in Java to convert temperature from Celcius to Fahrenheit.

import java.util.Scanner;

class TempConvert
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float celcius;

        System.out.println("--- INPUT ---");
        System.out.print(" - Temperature in °C: ");
        celcius = sc.nextFloat();

        float fahrenheit = (celcius * 9 / 5) + 32; 
        System.out.println("\n--- OUTPUT ---");
        System.out.println(celcius + "°C" + " = " + fahrenheit + "°F");
    }
}