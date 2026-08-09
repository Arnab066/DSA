package Basics;

class largest {
    public static void main(String args[]) {
        int arr[] = {
                23, 4, 56, 78, 9, 1004.0, 0, -1
        };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
