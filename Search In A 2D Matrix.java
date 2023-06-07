import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.

        int row = mat.size();
        int col= mat.get(0).size();
        for(int i = 0 ; i< row; i++){
           if( mat.get(i).contains(target)){
               return true;
           }
        }
        return false;
        
    }
}
