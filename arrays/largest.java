import java.util.*;

class largest {
    public static void main(String args[]) {
        int arr[] = { 102, 455, 67, 89, 54 };
        int larg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (larg < arr[i]) {
                larg = arr[i];
            }
        }
        System.out.println(larg);
    }
}