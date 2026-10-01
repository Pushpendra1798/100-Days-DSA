import java.util.*;
class Day20_StringToInteger {
    public static int atoiStringToInteger(String str) {
        int result = 0, sign = 1, start = 0;
        int n = str.length();

        if(n == 0) return 0;

        // Clearing white spaces
        while(start < n && str.charAt(start) == ' ') {
            start++;
        }

        // Handle sign
        if(start < n && (str.charAt(start) == '+' || str.charAt(start) == '-')) {
            if(str.charAt(start) == '-') {
                sign = -1;
            }
            start++;
        }

        // Covert digits
        while(start < n && Character.isDigit(str.charAt(start))) {
            int digit = str.charAt(start) - '0';

            if(result > (Integer.MAX_VALUE - digit)/10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;

            start++;
        }
        return result * sign;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter String: ");
            String str = sc.next();
            int finalResult = atoiStringToInteger(str);
            System.out.println("Result: " + finalResult);
        }
    }
}