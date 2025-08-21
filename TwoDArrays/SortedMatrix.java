package TwoDArrays;

public class SortedMatrix {

    public static boolean searchMAtrix(int matrix[][], int key) {
        // int row = 0, col = matrix[0].length - 1;

        // while (row < matrix.length && col >= 0) {
        // if (matrix[row][col] == key) {
        // System.out.print("found key at index (" + row + "," + col + ")");
        // return true;
        // } else if (key < matrix[row][col]) {
        // col--;
        // } else {
        // row++;
        // }
        // }

        // starting from leftside bottom
        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.print("found key  at index (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }

        System.out.println("Key is not Found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40, },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 45 },
                { 32, 33, 39, 50 } };
        int key = 30;
        searchMAtrix(matrix, key);
    }
}
