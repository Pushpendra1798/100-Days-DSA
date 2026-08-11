import java.util.*;
class Day05_CountSubarraysWithGivenSum {
    public static int countSubarraysWithGivenSum(int[] nums, int k) {
        int count = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int num : nums) {
            prefixSum += num;
            if(map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the no. of elements: ");
            int N = sc.nextInt();
            int[] nums = new int[N];
            System.out.print("Enter elements: ");
            for(int i=0; i<N; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.print("Enter Sum: ");
            int k = sc.nextInt();
            System.out.print("Total Subarrays With Given Sum: " + countSubarraysWithGivenSum(nums, k));
        }
    }
}
