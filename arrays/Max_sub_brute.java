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
        int[] arr = { 5, 8, 8, -6, 4 };
        System.out.println(maxSubArray(arr));
    }
}