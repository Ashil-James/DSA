package DSA;
import java.util.*;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        System.out.println("Contains Duplicate: " + result);
    }
}
