package Arrays;

//Using method Brute force!

public class SumSubArray {
      public static void maxSubArraySum(int numbers[]){
        int currSum = 0;
        
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){   /// print array
                    // SubArray Sum
                    currSum = currSum + numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                  maxSum = currSum;  
                }
           
            }
        }
        System.out.println("Max Sum = " + maxSum  );
         
    }

    public static void optimizeSumSubarray(int numbers[]){
          int currSum = 0;
        
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];   //If(Start == 0){currSum = prefix[end]} else{prefix[end] : prefix[end] - prefix[start -1];   }
                System.out.println(currSum);

                // maximun sum
                if (maxSum < currSum) {
                  maxSum = currSum;  
                }
           
            }
        }
        System.out.println("Max Sum = " + maxSum  );
    }


    /// Max sum subArray 
    public static void kadanes(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<numbers.length; i++){
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Our max Subarray sum is = " + maxSum);
    }


    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, 5};
        maxSubArraySum(numbers);
    }
}
