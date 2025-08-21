package Arrays;

//using method  Brute force.
public class SubArray {
    public static void subArray(int numbers[]){
        int totalSub = 0;
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){   /// print array
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                totalSub++;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays is : " + totalSub );
         System.out.println("sum of total subarray : " + sum);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        subArray(numbers);
    }
}
