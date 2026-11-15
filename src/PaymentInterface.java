/*
WAP in Java to create Payment with pay() and generateReceipt(). 
Implement CashPayment, CardPayment, and UPIPayment.
*/

abstract class Payment
{
    public float Amount;

    public void pay(float amount)
    {
        Amount = amount;
    }

    public void generateReceipt()
    {
        System.out.println("Amount: " + Amount);
    }
}

class CashPayment extends Payment 
{
    @Override 
    public void generateReceipt()
    {
        System.out.println("Payment done using Cash");
        super.generateReceipt();
    }
}

class CardPayment extends Payment
{
    @Override 
    public void generateReceipt()
    {
        System.out.println("Payment done using Card");
        super.generateReceipt();
    }
}

class UPIPayment extends Payment
{
    @Override 
    public void generateReceipt()
    {
        System.out.println("Payment done using UPI");
        super.generateReceipt();
    }
}

class PaymentInterface
{
    public static void main(String args[])
    {
        CashPayment cash = new CashPayment();
        CardPayment card = new CardPayment();
        UPIPayment upi = new UPIPayment();

        cash.pay(100);
        card.pay(200);
        upi.pay(300);

        System.out.println("--- [OUTPUT] ---");
        cash.generateReceipt();
        card.generateReceipt();
        upi.generateReceipt();
    }
}