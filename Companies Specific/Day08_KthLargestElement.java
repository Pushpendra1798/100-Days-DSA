import java.util.PriorityQueue;
import java.util.Scanner;
class Day08_KthLargestElement {

    // Using Min Heap --------------->
    public static int KthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.offer(num);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no. of Elements: ");
            int N = sc.nextInt();
            int[] nums = new int[N];
            System.out.print("Enter elements: ");
            for(int i=0; i<N; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.print("Enter Kth value: ");
            int K = sc.nextInt();
            System.out.print("Kth Largest Element: " +  KthLargestElement(nums, K));
        }
    }
} 