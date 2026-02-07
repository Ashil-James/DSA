package DSA;
import java.util.*;
public class productExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int res [] = new int[nums.length]; 
        int prefix = 1;
        int postfix = 1;

        //Calculate prefix product and store in result array
        for(int i = 0 ; i < nums.length ; i++) {
            res[i] = prefix;
            prefix *= nums[i]; 
        }

        // Calculate postfix product and multiply with prefix product in result array
        for(int i = nums.length - 1 ; i >=0 ; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {1, 2, 3, 4};
        int result[] = productExceptSelf(nums);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
