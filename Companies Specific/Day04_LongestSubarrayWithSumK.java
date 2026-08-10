import java.util.*;
class Day04_LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        int count = 0, prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            prefix += num;
            if(map.containsKey(prefix-k)) {
                count += map.get(prefix-k);
            }
            map.put(prefix, map.getOrDefault(prefix, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int N = sc.nextInt();
            int[] nums = new int[N];
            System.out.print("Enter Elements: ");
            for(int i=0; i<N; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.print("Enter Sum K: ");
            int K = sc.nextInt();
            System.out.println("Longest Subarray With Sum K: " + longestSubarrayWithSumK(nums, K));
        }
    }
}
