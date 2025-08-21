package TwoDArrays;

public class Assignment {

    public static int searchMAtrix(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void sumMatrix(int matrix[][]) {
        int row = 1, sum = 0;
        int col = matrix[1].length;
        for (int i = 0; i < col; i++) {
            sum += matrix[row][i];
        }
        System.out.println("Sum of second metrix = " + sum);

    }

    public static void main(String[] args) {
        // int matrix[][] = {
        // { 4, 7, 8 },
        // { 8, 8, 7 } };
        // int key = 7;
        // System.out.println(searchMAtrix(matrix, key));

        int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        sumMatrix(matrix);
    }
}
