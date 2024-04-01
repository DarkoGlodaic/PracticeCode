public class LastWordLength {
    public static void main(String[] args) {
        String s = "What's the point of being grown-up, if we can't be childish sometimes.";
        System.out.println("The length of the last word is: " + lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length -1].length();
    }
}
