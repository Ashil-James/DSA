package DSA;
import java.util.*;

public class MinimumProduct {

    public static int minProduct(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[low] <= nums[high]){
                ans = Math.min(ans, nums[low]);
                break;
            }

            if(nums[low] <= nums[mid]){
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else {
                high = mid - 1;
                ans = Math.min(ans, nums[mid]);
            }
        }

        return ans;
    }
    

    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 11};
        int result = minProduct(arr);
        System.out.println("Minimum Product: " + result);
    }
}
