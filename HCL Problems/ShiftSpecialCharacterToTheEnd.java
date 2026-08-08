import java.util.*;
class ShiftSpecialCharacterToTheEnd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String alphaNum = "";
            String special = "";
            for(char ch : str.toCharArray()) {
                if(ch != '@' && ch != '#' && ch != '!') {
                    alphaNum += ch;
                } else {
                    special += ch;
                }
            }
            System.out.println(alphaNum + special);
        }
    }
}
