package Arrays;

public class LargestNumber {

    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -Infinity ke liye
        int smallest = Integer.MAX_VALUE; // +Infinity
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
            System.out.println("Smallest value is : " + smallest);

            return largest;
    }
    public static void main(String[] args) {
        int numbers [] = {1, 2, 4, 3, 7, 5, 4};
        System.out.println("Largest value is : " + getlargest(numbers));

    }
}
