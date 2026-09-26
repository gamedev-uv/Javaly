//WAP in Java to accept a square matrix and calculate the sums of the main and secondary diagonals.

import java.util.Scanner;

class DiagonalSum
{
    static int[][] populateMatrixWithInput(int[][] matrix, Scanner sc)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                System.out.print("  - Element at " + i + ", " + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    static void displayMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");

            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("--- INPUT ---");
        System.out.println(" - Enter dimension - ");

        System.out.print("  - N: ");
        n = sc.nextInt();

        System.out.println(" -- INPUT -- ");
        int[][] matrix = new int[n][n];
        matrix = populateMatrixWithInput(matrix, sc);
        displayMatrix(matrix);
        System.out.println();

        System.out.println("--- PRIMARY DIAGONAL ---");
        int pDSum = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == j)
                {
                    System.out.print(matrix[i][j]);
                    pDSum += matrix[i][j];
                }
                else
                    System.out.print("-");

                System.out.print(" ");
            }

            System.out.println();
        }
        System.out.println("Sum: " + pDSum);

        System.out.println("\n--- SECONDARY DIAGONAL ---");
        int sDSum = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i + j == n - 1)
                {
                    System.out.print(matrix[i][j]);
                    sDSum += matrix[i][j];
                }
                else
                    System.out.print("-");

                System.out.print(" ");
            }

            System.out.println();
        }
        System.out.println("Sum: " + sDSum);
    }
}