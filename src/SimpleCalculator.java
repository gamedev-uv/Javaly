/*
WAP in Java to accept two numbers and an operator (+, -, *, /) and display the result. 
Use a switch statement.
*/

import java.util.Scanner;

class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float a, b;
        char operator;

        System.out.println("--- INPUT ---");
        System.out.print(" - 1st Operand: ");
        a = sc.nextFloat();

        System.out.print(" - 2nd Operand: ");
        b = sc.nextFloat();

        System.out.print(" - Operator: ");
        operator = sc.next().charAt(0);

        System.out.println("\n--- OUTPUT ---");
        System.out.print(a + " " + operator + " " + b + " = ");
        switch(operator)
        {
            case '+': System.out.print(a + b); break;
            case '-': System.out.print(a - b); break;
            case '*': System.out.print(a * b); break;
            case '/': System.out.print(a / b); break;
            default:  System.out.print("Invalid Operator"); break;
        }
    }
}