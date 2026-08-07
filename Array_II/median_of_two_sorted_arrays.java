package Array_II;

public class median_of_two_sorted_arrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] nums2 = { 3, 4 };
        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                arr[k++] = nums1[i++];
            else
                arr[k++] = nums2[j++];
        }

        while (i < m)
            arr[k++] = nums1[i++];

        while (j < n)
            arr[k++] = nums2[j++];

        int len = arr.length;

        double median;

        if (len % 2 == 1)
            median = arr[len / 2];
        else
            median = (arr[len / 2] + arr[len / 2 - 1]) / 2.0;

        System.out.print("Merged Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Median = " + median);
    }
}
