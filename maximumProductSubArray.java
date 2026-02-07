package DSA;
import java.util.*;
public class maximumProductSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2, 3, -2, 4};
        int n = nums.length;

        int prefix = 1, suffix = 1;
        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(prefix ==0 ) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix *= nums[i];
            suffix *= nums[n - 1 - i];
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }
        System.out.println("Maximum Product Subarray: " + maxProduct);
    }
}
