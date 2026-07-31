package String;

public class length_of_last_word {
    public static void main(String[] args) {
        String s = "Hello World   ";

        int i = s.length() - 1;
        int count = 0;
        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // Count the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        System.out.println("Length of last word: " + count);
    }
}
