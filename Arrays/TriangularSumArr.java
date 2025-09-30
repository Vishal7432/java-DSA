package Arrays;

public class TriangularSumArr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // System.out.println(triangularSum(arr));
        System.out.println(TriangularSum(arr));
    }

    static int triangularSum(int[] nums) {
        while (nums.length > 1) {
            int[] newArr = new int[nums.length - 1];
            for (int i = 0; i < nums.length - 1; i++) {
                newArr[i] = (nums[i] + nums[i + 1]) % 10;
            }
            nums = newArr;
        }
        return nums[0];
    }

    // optimized approach
    static int TriangularSum(int[] nums) {
        int n = nums.length;
        int result = 0;
        long coeff = 1; // C(n-1, 0)

        for (int i = 0; i < n; i++) {
            result = (int) ((result + coeff * nums[i]) % 10);
            // next binomial coefficient C(n-1, i+1)
            coeff = coeff * (n - 1 - i) / (i + 1);
        }
        return result;
    }

}