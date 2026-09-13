//WAP in Java Matrix Addition Accept two matrices of the same dimensions and calculate their sum.

import java.util.Scanner;

class MatrixAdd
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

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.println("--- INPUT ---");
        System.out.println(" - Enter dimensions - ");

        System.out.print("  - M: ");
        m = sc.nextInt();
        System.out.print("  - N: ");
        n = sc.nextInt();

        System.out.println(" -- INPUT [MATRIX A] --");
        int[][] matrixA = new int[m][n];
        matrixA = populateMatrixWithInput(matrixA, sc);
        displayMatrix(matrixA);
        System.out.println();

        System.out.println(" -- INPUT [MATRIX B] --");
        int[][] matrixB = new int[m][n];
        matrixB = populateMatrixWithInput(matrixB, sc);
        displayMatrix(matrixB);

        System.out.println("\n--- SUM ---");
        displayMatrix(addMatrices(matrixA, matrixB));
    }
}