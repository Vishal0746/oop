import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = input.nextInt();

            System.out.print("Enter the number of columns: ");
            int columns = input.nextInt();

            int[][] matrix = new int[rows][columns];

            System.out.println("Enter the elements of the matrix:");

            // Read matrix elements from the user
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }

            System.out.println("Original Matrix:");
            displayMatrix(matrix);

            int[][] transposeMatrix = transpose(matrix);

            System.out.println("Transpose Matrix:");
            displayMatrix(transposeMatrix);
        }
    }

    // Function to find the transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
