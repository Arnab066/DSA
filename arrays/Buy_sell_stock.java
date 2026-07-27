import java.util.Scanner;

class Solution {

    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; // Least so far
        int op = 0; // Overall profit
        int pist = 0; // Profit if sold today

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }

            pist = prices[i] - lsf;

            if (op < pist) {
                op = pist;
            }
        }

        return op;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input stock prices
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int profit = sol.maxProfit(prices);

        System.out.println("Maximum Profit: " + profit);

        sc.close();
    }
}