
import java.util.HashSet;
import java.util.Scanner;

public class Day12_LongestSubstringWithoutRepeatedCharacter {

    // Longest Substring Without Repeated Character
    public static int longestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()) {
            char ch = s.charAt(right);
            if(!set.contains(ch)) {
                set.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enetr String: ");
            String s = sc.nextLine();
            System.out.print("Length of longest substring: " + longestSubstring(s));
        }
    }
}
