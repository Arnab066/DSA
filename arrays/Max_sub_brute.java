import java.util.*;

class Max_sub_brute {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int st = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                int currsum = 0;
                for (int k = st; k <= end; k++) {
                    currsum += nums[k];
                }
                if (max < currsum) {
                    max = currsum;
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
}