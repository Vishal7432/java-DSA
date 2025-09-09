package Arrays;

public class FindNum {
    // Given a non-empty array of integers nums, every element appears twice except
    // for one. Find that single one.
    public static int findNumber(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                } else if (count == 1) {
                    return num;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 1 };
        System.out.println(findNumber(arr));
    }
}
