/*
WAP in Java to create overloaded 
- add(int,int)
- add(double,double)
- add(int,int,int) 
methods to demonstrate compile-time polymorphism.
*/

class MethodOverloading
{
    static int add(int a, int b)
    {
        return a + b;
    }

    static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    static double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String args[])
    {
        System.out.println("--- [OUTPUT] ---");
        System.out.println("1 + 2 = " + add(1, 2));
        System.out.println("1.5 + 2.5 = " + add(1.5, 2.5));
        System.out.println("1 + 2 + 3 = " + add(1, 2, 3));
    }
}