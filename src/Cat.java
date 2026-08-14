/*
WAP in Java to create a class called "Cat" with instance variables name and age. 
Implement a default constructor that initializes the name to "Unknown" and the age to 0. 
Print the values of the variables.
*/

class Cat
{
    public Cat()
    {
        name = "Unknown";
        age = 0;
    }

    String name;
    int age;

    public static void main(String args[])
    {
        Cat cat = new Cat();

        System.out.println("--- OUTPUT ---");
        System.out.println(" - Name: " + cat.name);
        System.out.println(" - Age: " + cat.age);
    }
}