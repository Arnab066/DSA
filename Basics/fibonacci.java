package Basics;

public class fibonacci {
    public static void main(String[] args) {
        int terms = 10;
        int first = 0, second = 1;

        System.out.print(first + " ");
        System.out.print(second + " ");

        for (int i = 3; i <= terms; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
        }
    }
}
