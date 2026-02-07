package DSA;
import java.util.*;
public class BuySellStocks_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] prices = {7, 1, 5, 3, 6, 4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Update maximum profit
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
