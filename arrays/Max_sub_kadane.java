class Max_sub_kadane {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < nums.length; i++) {
            currsum += nums[i];
            if (currsum < 0) {
                currsum = 0;
            }
            max = Math.max(max, currsum);
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = { 5, 8, 8, -6, 4 };
        System.out.println(maxSubArray(arr));
    }
}