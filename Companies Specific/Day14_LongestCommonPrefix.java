import java.util.Scanner;

public class Day14_LongestCommonPrefix {

    // Horizontal Scanning
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1; i<strs.length; i++) {
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }


    // Vertical Scanning
    public static String longestCommonPrefix1(String[] strs) {
        String prefix = "";
        for(int i=0; i<strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++) {
                if(i>=strs[j].length()||ch != strs[j].charAt(i)) {
                    return prefix;
                }
            }
            prefix += ch;
        }
        return prefix;
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no. of Strings:");
            int N = sc.nextInt();
            String[] strs = new String[N];
            System.out.print("Enter Strings: "); 
            for(int i=0; i<N; i++) {
                strs[i] = sc.next();
            }
            System.out.print("Longest common prefix: " + longestCommonPrefix1(strs));
        }
    }
}
