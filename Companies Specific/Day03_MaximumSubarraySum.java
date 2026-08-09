import java.util.*;
public class Day03_MaximumSubarraySum {
    public static int maximumSubarraySum(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int num : nums) {
            sum += num;
            max = Math.max(max, sum);
            if(sum < 0) sum = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            System.out.print("Enter elements: ");
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("largest sum: " + maximumSubarraySum(arr));
        }
    }
}
