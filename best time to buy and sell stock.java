import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int max_profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< prices.size();i++){
            if(prices.get(i)< min){
                min = prices.get(i);
            }
            else if(prices.get(i)- min > max_profit){
                max_profit = prices.get(i)- min;
            }
        }
        return max_profit;
        
    }
}
