import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();

        int missing = 0;
        int repeating = 0;

        for (int num : arr) {
            if (set.contains(num)) {
                repeating = num;
            }
            set.add(num);
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        result[0] = missing;
        result[1] = repeating;

        return result;
    }
}
