/*
WAP in Java to demonstrate the difference between String literals and
String objects created using new. Compare them using == and equals() and display
the results with suitable output.
*/

class StringEquals
{
    public static void main(String args[])
    {
        String literal = "Hello World";
        String obj = new String("Hello World");

        System.out.println(literal + " == " + obj + " : " + (literal == obj));
        System.out.println(literal + ".equals(" + obj + "): " + (literal.equals(obj)));
    }
}