package DSA.Backtracking;
import java.util.*;

public class LettercombinationsOfPhoneNumber {
    String[] map = {
        "",      // 0
        "",      // 1
        "abc",   // 2
        "def",   // 3
        "ghi",   // 4
        "jkl",   // 5
        "mno",   // 6
        "pqrs",  // 7
        "tuv",   // 8
        "wxyz"   // 9
    };

    public List<String> letterCombinations(String digits) {
        
        List<String> res = new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }

        backtrack(0, digits, "", res);
        return res;    
    }

    public void backtrack(int index, String digit, String current, List<String> res) {

        if(current.length() == digit.length()) {
            res.add(current);
            return;
        }

        String letters = map[digit.charAt(index) - '0'];

        for(int i=0; i<letters.length(); i++) {

            char ch = letters.charAt(i);
            backtrack(index+1, digit, current + ch, res);
        }
    }
}