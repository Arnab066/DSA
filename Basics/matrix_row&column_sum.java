package Basics;

import java.util.*;
class matrix_row_column_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Input
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;

        // Maximum row sum
        for (int i = 0; i < r; i++) {
            int rowSum = 0;

            for (int j = 0; j < c; j++) {
                rowSum += matrix[i][j];
            }

            maxRow = Math.max(maxRow, rowSum);
        }

        // Maximum column sum
        for (int j = 0; j < c; j++) {
            int colSum = 0;

            for (int i = 0; i < r; i++) {
                colSum += matrix[i][j];
            }

            maxCol = Math.max(maxCol, colSum);
        }

        System.out.println("Maximum Row Sum = " + maxRow);
        System.out.println("Maximum Column Sum = " + maxCol);
    }
}
