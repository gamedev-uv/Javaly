/*
WAP in Java to create a class called Account with instance variables accountNumber and balance. 
Implement a parameterized constructor that initializes these variables with validation:
- accountNumber should be non-null and non-empty.
- balance should be non-negative.
- Print an error message if the validation fails.
*/

import java.util.Scanner;

class Account
{
    public Account(String accountNumber, float balance)
    {
        if(accountNumber == null || accountNumber.isEmpty())
        {
            System.out.println("Account number can't be null or empty!");
            return;
        }

        if(balance < 0)
        {
            System.out.println("Account balance can not be negative");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private String accountNumber;
    private float balance;

    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");
        System.out.print(" - Account no: ");
        String accountNo = sc.next();

        System.out.print(" - Balance: ");
        float balance = sc.nextFloat();

        Account acc = new Account(accountNo, balance);
        System.out.println("\n--- OUTPUT ---");
        System.out.println(" - Account no : " + acc.accountNumber);
        System.out.println(" - Balance    : " + acc.balance);
    }
}