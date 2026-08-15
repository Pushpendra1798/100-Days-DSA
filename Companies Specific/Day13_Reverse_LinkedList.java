

public class Day13_Reverse_LinkedList {

    
    // Node Class -->
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }


    // Reverse Linked List
    static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }


    // Print Linked list
    static void printList(Node head) {
        Node curr = head;

        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        
        //Create Linked List
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List:");
        printList(head);

        // Reverse Linked List
        head = reverseList(head);
        System.out.print("Reversed Linked List:");
        printList(head);
    }
}
