import java.util.*;

class ShiftSpecialCharacterToTheEnd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            StringBuilder alphaNum = new StringBuilder();
            StringBuilder special = new StringBuilder();
            for (char ch : str.toCharArray()) {
                // if(ch != '@' && ch != '#' && ch != '!') {
                if (Character.isLetterOrDigit(ch)) { // we have inbuild method for checking letter or digit
                    alphaNum.append(ch);
                } else {
                    special.append(ch);
                }
            }
            System.out.println(alphaNum.append(special));
        }
    }
}
