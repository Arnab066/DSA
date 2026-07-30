package Array_II;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_val = matrix[mid / n][mid % n];

            if (mid_val == target)
                return true;
            else if (mid_val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}
/*class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = 0;
        int n = matrix[0].length - 1;

        while (m < matrix.length && n >= 0) {
            if(matrix[m][n] == target){
                return true;
            }
            else if(target < matrix[m][n]){
                n--;
            }
            else{
                m++;
            }
        }
        return false;
    }
} */
