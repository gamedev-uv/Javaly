import java.util.Scanner;

class AddNumbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("--- INPUT ---\n");
        System.out.print(" - Enter the value of A: ");
        int a = sc.nextInt();

        System.out.print(" - Enter the value of B: ");
        int b = sc.nextInt();

        System.out.print("\n--- OUTPUT ---\n");
        System.out.print(a + " + " + b + " = " + (a + b));
    }
}