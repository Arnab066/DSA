package Array_II;

public class diagonal_sum {
    public static int diagonalSum(int[][] mat) {

        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {

            // Primary Diagonal
            sum += mat[i][i];

            // Secondary Diagonal
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Matrix:");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        int result = diagonalSum(mat);

        System.out.println("Diagonal Sum = " + result);
    }
}