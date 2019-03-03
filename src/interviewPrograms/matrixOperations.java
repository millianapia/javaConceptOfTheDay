package interviewPrograms;

import java.util.Scanner;

public class matrixOperations {

    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.println("Rows: ");
        int rows = inn.nextInt();
        System.out.println("Columns");
        int cols = inn.nextInt();
        int[][] matrix = fillMatrixRandom(rows, cols);
        int[][] matrix2 = fillMatrixRandom(rows, cols);
        int[][] matrixAdd = matrixAddition(matrix, matrix2, rows, cols);
        int[][] matrixSubtract = matrixSubtraction(matrix, matrix2, rows, cols);
        printMatrix(matrix, rows, cols);
        printMatrix(matrix2, rows, cols);
        printMatrix(matrixAdd, rows, cols);
        printMatrix(matrixSubtract, rows, cols);
    }



    private static int[][] matrixSubtraction(int[][]  matrix1, int[][] matrix2, int rows, int cols) {
        int[][] returnMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                returnMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return returnMatrix;    }

    private static int[][] matrixAddition(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] returnMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                returnMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return returnMatrix;
    }



    private static int[][] fillMatrixRandom(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int random = (int)(Math.random() * 50 + 1);
                matrix[i][j] = random;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix, int row, int cols) {
        System.out.println("your matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrix(int rows, int cols, Scanner inn) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("fill inn for: " + i + " " + j);
                matrix[i][j] = inn.nextInt();
            }
        }
        return matrix;
    }



}
