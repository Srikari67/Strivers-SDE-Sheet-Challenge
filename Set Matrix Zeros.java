import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
       
        int n = matrix.length;
        int m = matrix[0].length;         int col0 = 1;
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] == 0) {
                // mark i-th row:
                matrix[i][0] = 0;

                // mark j-th column:
                if (j != 0)
                    matrix[0][j] = 0;
                else
                    col0 = 0;
            }
        }
    }

   
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
            if (matrix[i][j] != 0) {
                // check for col & row:
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    if (matrix[0][0] == 0) {
        for (int j = 0; j < m; j++) {
            matrix[0][j] = 0;
        }
    }
    if (col0 == 0) {
        for (int i = 0; i < n; i++) {
            matrix[i][0] = 0;
        }
    }
        
       /* for(int i = 0; i <n;i++){
            for(int j = 0; j< m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n"); 
        }
*/
      
    }

}
