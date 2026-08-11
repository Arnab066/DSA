package Array_II;

class second_largest {
    public static void main(String args[]) {
        int arr[] = { 23, 4, 7, 8, 9 };
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
