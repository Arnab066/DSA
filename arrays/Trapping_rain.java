class Trapping_rain {
    public static int trap(int[] height) {
        int n = height.length;
        // leftmax
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }
        // rightmax
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }
        // trapwater
        int trapwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterlevel - height[i];
        }
        return trapwater;
    }

    public static void main(String[] args) {
        int[] height = { 0, 5, 4, 2, 8, 0, 5 };
        System.out.println(trap(height));
    }
}