package TwoDArrays;

public class Transpose {

    public static int[][] transpose(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;

        int trans[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                trans[j][i] = matrix[i][j]; // Corrected indices
            }
        }
        return trans; // Return the transposed matrix
    }

    public static void printTrnspose(int matrix[][]) {
        System.out.println("The matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 2, 5, 9, 3 },
                { 10, 8, 6, 9 },
                { 8, 9, 6, 1 } };
        int transposed[][] = transpose(matrix); // Store the transposed matrix
        printTrnspose(transposed); // Print the transposed matrix
    }
}