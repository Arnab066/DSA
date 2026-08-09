package Basics;

/* 
class zeroes_in_fact {
    public static int trailingZeroes(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        int count = 0;
        while (fact > 0) {
            int dig = fact % 10;
            if (dig == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println(trailingZeroes(n));
    }
}
*/
class zeroes_in_fact {
    public static int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        return count;
    }
}