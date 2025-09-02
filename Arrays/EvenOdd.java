package Arrays;

public class EvenOdd {
    public static void CountEvenOdd(int arr[]) {
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("Even Element : " + even + "  Odd Element : " + odd);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 9, 6, 7, 3 };
        CountEvenOdd(arr);
    }
}
