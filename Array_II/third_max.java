package Array_II;

public class third_max {
    public static int thirdMax(int[] nums) {
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;
        for (long num : nums) {
            if (num == f || num == s || num == t) {
                continue;
            } else if (num > f) {
                t = s;
                s = f;
                f = num;
            } else if (num > s) {
                t = s;
                s = num;
            } else if (num > t) {
                t = num;
            }
        }
        return t == Long.MIN_VALUE ? (int) f : (int) t;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1 };
        System.out.println(thirdMax(nums));
    }
}
