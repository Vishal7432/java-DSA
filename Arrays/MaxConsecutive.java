package Arrays;

public class MaxConsecutive {
    // Given a binary array nums, return the maximum number of consecutive 1's in
    // the array.
    public static int maxConsecutive(int arr[]) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            max = Math.max(max, count);
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };
        System.out.println(maxConsecutive(arr));
    }
}