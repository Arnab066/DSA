package String;

class is_palindrome {
    public static void main(String[] args) {
        String s = "aba";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
/*
 * //leetcode 125
 * 
 * class Solution {
 * public boolean isPalindrome(String s) {
 * 
 * int left = 0;
 * int right = s.length() - 1;
 * 
 * while (left < right) {
 * 
 * while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
 * left++;
 * }
 * 
 * while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
 * right--;
 * }
 * 
 * if (Character.toLowerCase(s.charAt(left))
 * != Character.toLowerCase(s.charAt(right))) {
 * return false;
 * }
 * 
 * left++;
 * right--;
 * }
 * 
 * return true;
 * }
 * }
 */