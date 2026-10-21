import java.util.Scanner;

abstract class BankAccount
{
    public long accountNumber;
    public String accountHolderName;
    public double balance;

    public abstract void calculateInterest();
    public abstract void withdraw(double amount);

    public final void deposit(double amount)
    {
        balance += amount;
        System.out.println("Rs." + amount + " was deposited into the account. Resulting Balance: " + balance);
    }

    public final void displayAccountDetails()
    {
        System.out.println("\n - Account Details - ");
        System.out.println("Number      : " + accountNumber);
        System.out.println("Holder Name : " + accountHolderName);
        System.out.println("Balance     : Rs." + balance);
    }
}

class SavingsAccount extends BankAccount
{
    @Override 
    public void calculateInterest()
    {
        double interest = 0.05f * balance;
        balance += interest;
        System.out.println("Interest of Rs." + interest + " has been added to the account. Resulting Balance: " + balance);
    }

    @Override 
    public void withdraw(double amount)
    {
        if((balance - amount) < 1000) 
        {
            System.out.println("Current Balance: Rs." + balance);
            System.out.println("Can't withdraw Rs." + amount + " as a minimum balance of Rs.1000 is to be maintained!");
            return;
        }

        balance -= amount;
        System.out.println("Rs." + amount + " was withdrawn from the account. Remaining Balance: " + balance);
    }
}

class CurrentAccount extends BankAccount
{
    @Override
    public void calculateInterest() {}

    @Override 
    public void withdraw(double amount)
    {
        if(amount > 10000) 
        {
            System.out.println("Can't withdraw more than Rs.10000 at once!");
            return;
        }

        balance -= amount;
        System.out.println("Rs." + amount + " was withdrawn from the account. Remaining Balance: " + balance);
    }
}

class BankAccountManager
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SavingsAccount sAcc = new SavingsAccount();
        CurrentAccount cAcc = new CurrentAccount();

        System.out.println("--- INPUT ---");
        System.out.print(" - Name: ");
        sAcc.accountHolderName = sc.nextLine();
        cAcc.accountHolderName = sAcc.accountHolderName;

        System.out.print(" - Savings Account No: ");
        sAcc.accountNumber = sc.nextLong();

        System.out.print(" - Savings Account Balance: ");
        sAcc.balance = sc.nextFloat();

        System.out.print(" - Current Account No: ");
        cAcc.accountNumber = sc.nextLong();

        System.out.print(" - Current Account Balance: ");
        cAcc.balance = sc.nextFloat();

        BankAccount selectedAcc = sAcc;
        System.out.println("- Savings account has been selected by default -\n");

        while(true)
        {
            System.out.println("--- Commands ---");
            System.out.println(" 0. Switch to " + (selectedAcc == sAcc ? "Current" : "Savings") +  " Account");
            System.out.println(" 1. Deposit");
            System.out.println(" 2. Withdraw");
            System.out.println(" 3. Calculate Interest");
            System.out.println(" 4. Display Account Details");
            System.out.println(" X. Exit");
            System.out.print(" - Choice: ");

            int choice = sc.nextInt();
            System.out.println();

            double amount;

            switch(choice)
            {
                case 0:
                    selectedAcc = selectedAcc == sAcc ? cAcc : sAcc;
                    System.out.println("Switched account");
                break;

                case 1:
                case 2:
                    System.out.print(" - Amount: ");
                    amount = sc.nextFloat();

                    if(choice == 1)
                        selectedAcc.deposit(amount);
                    else
                        selectedAcc.withdraw(amount);
                break;

                case 3: 
                    selectedAcc.calculateInterest();
                break;

                case 4:
                    selectedAcc.displayAccountDetails();
                break;

                default: return;
            }

            System.out.println();
        }
    }
}