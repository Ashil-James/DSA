package DSA;
import java.util.*;
class NumberofOneBits {
    public int hammingWeight(int n) {
        int count = 0;

        while(n > 0) {
            n = n & (n - 1);
            count++;
        }

        return count;  
    }
}