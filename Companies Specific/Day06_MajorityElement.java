import java.util.*;
public class Day06_MajorityElement {

    // Using Nested Loop ------------------------->
    public static int mejorityElement(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=0; j<n; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > n/2) {
                return nums[i];
            }
        }
        return -1;
    }


    // Optimize approach using HashMap ------------------->
    public static int mejorityElement1(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1); // count frequency
        }

        int result = 0;
        for(int key : map.keySet()) {  // Traverse on keySet
            if(map.get(key) > n/2) {
                result = key; // mejority element
            }
        }
        return result;
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
            System.out.println("Mejority element: " + mejorityElement1(nums));
        }
    }
}
