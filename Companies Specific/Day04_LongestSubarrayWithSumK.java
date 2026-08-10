import java.util.*;
class Day04_LongestSubarrayWithSumK {

    // Count the number of Longest Subarray whose Sum equals K
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        int count = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int num : nums) {
            prefixSum += num;
            if(map.containsKey(prefixSum-k)) {
                count += map.get(prefixSum-k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }

    // Determine the length of Longest Subarray whose Sum equals K
    public static int longestSubarrayWithSumK1(int[] nums, int k) {
        int maxLenth = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0; i<nums.length; i++) {
            prefixSum += nums[i];
            if(map.containsKey(prefixSum-k)) {
                int length = i - map.get(prefixSum-k);
                maxLenth = Math.max(maxLenth, length);
            }
            if(!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLenth;
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
            System.out.println("Longest Subarray With Sum K: " + longestSubarrayWithSumK1(nums, K));
        }
    }
}
