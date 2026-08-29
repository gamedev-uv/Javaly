/*
WAP in menu driven program to create a two-dimensional integer array (matrix)
and perform the following operations using a menu-driven approach.
Tasks
- Matrix Creation and Display
- Matrix Addition
- Matrix Subtraction
- Matrix Multiplication
*/

import java.util.Scanner;

class MatrixMenu
{
    static int[][] populateMatrixWithInput(int[][] matrix, Scanner sc)
    {
        System.out.println(" Enter elements");
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

    static int[][] addMatrices(int[][] matrixA, int[][] matrixB)
    {
        int m = matrixA.length;
        int n = matrixA[0].length;

        int[][] matrixC = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j]; 
        }

        return matrixC;
    }

    static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB)
    {
        int m = matrixA.length;
        int n = matrixA[0].length;

        int[][] matrixC = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j]; 
        }

        return matrixC;
    }

    
    static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB)
    {
        int m1 = matrixA.length;
        int n1 = matrixA[0].length;

        int m2 = matrixB.length;
        int n2 = matrixB[0].length;

        int[][] matrixC = new int[m1][n2];
        for(int i = 0; i < m1; i++)
        {
            for(int j = 0; j < n2; j++)
            {
                int sum = 0;
                for(int k = 0; k < n2; k++)
                    sum += matrixA[i][k] * matrixB[k][j];

                matrixC[i][j] = sum;
            }
        }

        return matrixC;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int m1, n1;
        System.out.println("--- INPUT [MATRIX A] ---");
        System.out.println(" Enter dimension");

        System.out.print("  - M1: ");
        m1 = sc.nextInt();
        System.out.print("  - N1: ");
        n1 = sc.nextInt();

        int[][] matrixA = new int[m1][n1];
        matrixA = populateMatrixWithInput(matrixA, sc);
        displayMatrix(matrixA);

        while(true)
        {
            System.out.println("\n--- OPERATIONS ---");
            System.out.println("1 -> Matrix Addition");
            System.out.println("2 -> Matrix Subtraction");
            System.out.println("3 -> Matrix Multiplication");
            System.out.println("4 -> Exit");
            System.out.print(" - Choice: ");

            int choice = sc.nextInt();
            if(choice >= 4) return;

            int m2, n2;
            System.out.println("--- INPUT [MATRIX B] ---");
            System.out.println(" Enter dimension");
            
            System.out.print("  - M2: ");
            m2 = sc.nextInt();
            System.out.print("  - N2: ");
            n2 = sc.nextInt();

            if(choice == 1 || choice == 2)//If addition or subtraction needs same order
            {
                if(m1 != m2 || n1 != n2)
                {
                    System.out.println("Dimensions don't match");                    
                    continue;
                }
            }
            if(choice == 3)//If Multiplication
            {
                if(n1 != m2)
                {
                    System.out.println("Dimensions not compatible for multiplication");                    
                    continue;
                }
            }

            int[][] matrixB = new int[m2][n2];
            matrixB = populateMatrixWithInput(matrixB, sc);
            displayMatrix(matrixB);

            switch(choice)
            {
                case 1: 
                    System.out.println("\n--- SUM ---");
                    displayMatrix(addMatrices(matrixA, matrixB));
                break;

                case 2: 
                    System.out.println("\n--- DIFFERENCE ---");
                    displayMatrix(subtractMatrices(matrixA, matrixB));
                break;

                case 3: 
                    System.out.println("\n--- PRODUCT ---");
                    displayMatrix(multiplyMatrices(matrixA, matrixB));
                break;
            }
        }
    }
}