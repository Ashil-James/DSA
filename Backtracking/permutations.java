package DSA.Backtracking;
import java.util.*;
public class permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean used[] = new boolean[nums.length];

        generatePermutations(nums, nums.length, res, used, new ArrayList<>());

        return res; 
    }

    public void generatePermutations(int[] nums, int n, List<List<Integer>>res, boolean used[], List<Integer> temp) {
        if(temp.size() == n) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(!used[i]){
                temp.add(nums[i]);
                used[i] = true;
                generatePermutations(nums, n, res, used, temp);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}