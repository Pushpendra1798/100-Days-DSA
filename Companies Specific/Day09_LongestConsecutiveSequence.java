import java.util.*;
class Day09_LongestConsecutiveSequence {

    // BruteForce Approach - Linear Search ------------->
    public static int longestConsecutive(int[] nums) {
        int longestStreak = 0;
        for(int num : nums) {
            int current = num;
            int count = 1;
            while(search(nums, current+1)) {
                current++;
                count++;
            }
            longestStreak = Math.max(count, longestStreak);
        }
        return longestStreak;
    }

    public static boolean search(int[] nums, int target) {
        for(int num: nums) {
            if(num == target) {
                return true;
            }
        }
        return false;
    }



    // Sorting Approach  -------------------->
    public static int longestConsecutive1(int[] nums)  {

        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int longestStreak = 0;
        int count = 1;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                continue;
            }

            if(nums[i] == nums[i-1]+1) {
                count++;
            } else {
                count = 1;
            }

            longestStreak = Math.max(longestStreak, count);
        }
        return longestStreak;
    }



    // HashSet Approach ------------------>
    public static int longestConsecutive2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int longestStreak = 0;
        for(int num : set) {
            // start sequence
            if(!set.contains(num-1)) {
                int current = num;
                int count = 1;

                while(set.contains(current+1)) {
                    current++;
                    count++;
                }
                longestStreak = Math.max(longestStreak, count);
            }
        }

        return longestStreak;
    }


    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no. of elements: ");
            int N = sc.nextInt();
            int[] nums = new int[N];
            System.out.print("Enter elements: ");
            for(int i=0; i<N; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.print("Length of longest sequence of consecutive integer: " + longestConsecutive2(nums));
        }
    }
}