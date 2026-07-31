package String;

class is_palindrome {
    public static void main(String[] args) {
        String s = "aba";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("False");
                break;
            }
        }
        System.out.println("True");
    }
}
