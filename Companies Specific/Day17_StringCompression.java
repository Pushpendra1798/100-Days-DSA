
import java.util.Scanner;

class Day17_StringCompression {


    // Two pointer approach--->
    public static int stringCompression(char[] chars) {
        int idx = 0;
        int i = 0;
        while(i<chars.length) {
            char ch = chars[i];
            int count = 0;
            // cout same character here
            while(i < chars.length  && chars[i] == ch) {
                count++;
                i++;
            }
            // character insert here 
            chars[idx++] = ch;
            if(count > 1) {
                String str = String.valueOf(count);
                for(char c : str.toCharArray()) {
                    chars[idx++] = c;
                }
            }

        }
        return idx;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            char[] chars = new char[N];
            for(int i=0; i<N; i++) {
                chars[i] = sc.next().charAt(0);
            }
            System.out.println(stringCompression(chars));
        }
    }
}