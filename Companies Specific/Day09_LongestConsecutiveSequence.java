import java.util.*;
class Day09_LongestConsecutiveSequence {

    // BruteForce Approach - Linear Search
    public static int longestConsecutive(int[] nums) {
        int longest = 0;
        for(int num : nums) {
            int current = num;
            int count = 1;
            while(search(nums, current+1)) {
                current++;
                count++;
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }

    public static boolean search(int[] nums, int target) {
        for(int num: nums) {
            if(num == target) {
                return true;
            }
        }
        return false;
    }





    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] nums = new int[N];
            for(int i=0; i<N; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(longestConsecutive(nums));
        }
    }
}