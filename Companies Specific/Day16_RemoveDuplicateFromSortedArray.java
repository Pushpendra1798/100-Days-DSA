import java.util.Scanner;

class Day16_RemoveDuplicateFromSortedArray {

    //using two pointer - Time complexity- O(N) | space complexity- O(1)
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j=1; j<nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
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
            System.out.print("Length of unique elements array: " + removeDuplicates(nums));
        }
    }
}
