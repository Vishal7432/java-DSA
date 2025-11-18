package Stack;

public class MaxAreaHisto {

    public static int maxArea(int arr[]) {
        int n = arr.length;

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int height = arr[i];

            // left smaller
            int left = i;
            while (left >= 0 && arr[left] >= height) {
                left--;
            }

            // right smaller
            int right = i;
            while (right < n && arr[right] >= right) {
                right++;
            }

            int width = right - left - 1;
            int area = width * height;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(arr));
    }
}
