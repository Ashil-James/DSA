package DSA;
import java.util.*;
public class Kadanes_Algorithm {

    public static int maxSubArraySum(int arr[]) {
        long maxSum = Long.MIN_VALUE;
        long sum = 0;

        for(int i = 0; i< arr.length; i++) {
            sum += arr[i];

            if(sum > maxSum) {
                maxSum = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }  
        
        return (int)maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubArraySum(arr);
        // Print the max subarray sum
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
