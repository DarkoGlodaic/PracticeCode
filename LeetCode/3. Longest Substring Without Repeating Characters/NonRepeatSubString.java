import java.util.HashSet;
import java.util.Set;

// Utilizes sliding window technique to find largest substring without repeating characters.
public class NonRepeatSubString {
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbed"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0; 
        int max = 0;
        Set<Character> chars = new HashSet<Character>();

        for(int right = 0; right < s.length(); right++) {
            while(chars.contains(s.charAt(right))) {
                chars.remove(s.charAt(left));
                left++;
            }
            
            chars.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        
        System.out.println(chars.toString());
        return max;
    }

}
