package Arrays;

public class CountFrequency {

    public static void frequencyElement(int arr[]) {
        int frequency[] = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = visited;
                }
                if (frequency[i] != visited) {
                    frequency[i] = count;
                }
            }

            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 5, 20 };
    }
}
