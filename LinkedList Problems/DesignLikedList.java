import java.util.*;
public class DesignLikedList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            LinkedList<Integer> list = new LinkedList<>();
            System.out.print("Enter numbers (enter a non-integer to stop): ");
            while(sc.hasNextInt()) {
                int value = sc.nextInt();
                list.add(value);
            }
            System.out.println("Your Linked List: " + list);
        }
    }
}
