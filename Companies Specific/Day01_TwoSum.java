import java.util.*;
class Day01_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int complements = target - nums[i];
            if(map.containsKey(complements)) {
                return new int[]{map.get(complements), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] nums = new int[N];
            for(int i=0; i<N; i++) {
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            System.out.println(Arrays.toString(twoSum(nums, target)));
        }
    }
}
