public class MainRunner {
    public static void main(String[] args) {
        String word = "ginger";
        printAnagrams(word, "");
    }
    public static void printAnagrams(String word, String anagram) {
        if (word.length() == 0) {
            System.out.println(anagram);
            return;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            String left = word.substring(0, i);
            String right = word.substring(i + 1);
            String rest = left + right;
            printAnagrams(rest, anagram + c);
        }
    }
}
