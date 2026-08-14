import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Day10_SubarrayWithZeroSum {

    // Using HashMap --------->
    public static boolean subArrayExists(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];

            if(sum == 0 || map.containsKey(sum)) return true;
            map.put(sum, i);
        }
        return false;
    }


    // Using HashSet ----------->
    public static boolean subArrayExists1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int num : nums) {
            if(sum == 0 || set.contains(sum)) return true;
            set.add(num);
        }
        return false;
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no. of elements: ");
            int N = sc.nextInt();
            int[] nums = new int[N];
            System.out.print("Enter elements: ");
            for(int i=0; i<N; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.print("SubArray Exists: " + subArrayExists1(nums));
        }
    }
}
