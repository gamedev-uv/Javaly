//WAP in Java to input differnt types of data types and display them.

import java.util.Scanner;

class InputOutput
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- INPUT ---");

        System.out.print(" - Enter integer: ");
        int integer = sc.nextInt();

        System.out.print(" - Enter float: ");
        float floating = sc.nextFloat();

        System.out.print(" - Enter boolean: ");
        boolean bool = sc.nextBoolean();

        System.out.print(" - Enter word: ");
        String word = sc.next();

        System.out.print(" - Enter sentence: ");
        sc.nextLine();
        String line = sc.nextLine();

        System.out.println("\n--- OUTPUT ---");
        System.out.println("int           : " + integer);
        System.out.println("float         : " + floating);
        System.out.println("boolean       : " + bool);
        System.out.println("String (Word) : " + word);
        System.out.println("String (Line) : " + line);
    }
}