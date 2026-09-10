//WAP in Java to create a Book class with title, author, and price. Use a parameterized constructor and displayBook(). Create three objects.

import java.util.Scanner;

class Book
{
    public Book(String title, String author, float price)
    {
        Title = title;
        Author = author;
        Price = price;
    }

    String Title, Author;
    float Price;

    void displayBook()
    {
        System.out.println(Title);
        System.out.println("by " + Author);
        System.out.println("Rs. " + Price);
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Book book1 = new Book("Project Hail Mary", "Andy Weir", 349f);
        Book book2 = new Book("Dune", "Frank Herbert", 550f);
        Book book3 = new Book("The Three-Body Problem", "Cixin Liu", 540f);

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
    }
}