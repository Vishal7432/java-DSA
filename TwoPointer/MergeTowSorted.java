package TwoPointer;

public class MergeTowSorted {

    public static int mergeTwoSorted(int arr1[], int arr2[]) {

        int len = arr1.length + arr2.length;
        int mergeArr[] = new int[len];
        int idx = 0;

        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergeArr[idx] = arr1[i];
                i++;
                idx++;
            } else {
                mergeArr[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while (i < arr1.length) {
            mergeArr[idx] = arr1[i];
            i++;
            idx++;
        }
        while (j < arr2.length) {
            mergeArr[idx] = arr2[j];
            j++;
            idx++;
        }
        return print(mergeArr);

    }

    public static int print(int mergeArr[]) {
        for (int i = 0; i < mergeArr.length; i++) {
            System.out.print(mergeArr[i]);
        }
        System.out.println();
        return 0;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 5, 5, 7, 8, 9 };

        System.out.println(mergeTwoSorted(arr1, arr2));
    }
}
