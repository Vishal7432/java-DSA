public class Assignment {

    // Problem 1
    // ForagivenintegerarrayofsizeN.Youhavetofindalltheoccurrences(indices)ofagivenelement(Key)andprintthem.
    // Usearecursivefunctiontosolvethisproblem

    public static void printAllOccurrences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        printAllOccurrences(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        printAllOccurrences(arr, key, 0);
    }
}