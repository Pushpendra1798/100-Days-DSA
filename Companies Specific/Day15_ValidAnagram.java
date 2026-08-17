
import java.util.Arrays;
import java.util.Scanner;

public class Day15_ValidAnagram {


    // Using Sorting - Time complexity - O(N log N) | Space Complexity - O(N)
    public static boolean validAnagram(String s1, String s2 ) {
        if(s1 == null || s2 == null || (s1.length() != s2.length())) return false;

        char[] firstString = s1.toCharArray();
        Arrays.sort(firstString);


        char[] secondString = s2.toCharArray();
        Arrays.sort(secondString);


        return Arrays.equals(firstString, secondString);  
    }



    // Using One Frequency Array - Time complexity - O(N) | Space compexity - O(1)
    public static boolean validAnagram1(String s1, String s2) {
        int[] freq = new int[26];
        for(int i=0; i<s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            freq[ch1 - 'a']++;
            freq[ch2 - 'a']--;
        }
        for(int count: freq) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String s1 = sc.next();


            System.out.print("Enter second string: ");
            String s2  = sc.next();
            System.out.println(validAnagram(s1, s2));
        }
    }
}
