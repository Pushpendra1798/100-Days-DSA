// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

import java.util.Scanner;

public class Day11_FindDuplicateNumber {

    // XOR Method ---------->
    public static int duplicateNumber(int[] nums) {
        int xor = 0;
        // XOR array elements
        for(int num : nums) {
            xor ^= num;
        }

        // XOR numbers from 1 to n
        for(int i=1; i<nums.length; i++) {
            xor ^= i;
        }
        return xor;
    }


    //Floyd's Cycle Algorithm ------------>
    public static int duplicateNumber1(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

            // Cycle detection
            do {
                slow = nums[slow];
                fast = nums[nums[fast]];
            } while(slow != fast);

            slow = nums[0];
            // Find duplicate
            while(slow != fast) {
                slow = nums[slow];
                fast = nums[fast];
            }
        return slow;
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
            System.out.print("Duplicate number: " + duplicateNumber(nums));
        }
    }
}
