package DSA;
import java.util.*;
class Add_Integer {
    public int getSum(int a, int b) {
        while(b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }

        return a;
        
    }
}