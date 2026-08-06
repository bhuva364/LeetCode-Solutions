import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {

        ArrayList<Integer> result = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) {

         
            for (int j = left; j <= right; j++) {
                result.add(mat[top][j]);
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;

            
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(mat[bottom][j]);
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}