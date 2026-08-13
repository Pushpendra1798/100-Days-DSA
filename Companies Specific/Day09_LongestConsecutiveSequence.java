import java.util.*;
class Day09_LongestConsecutiveSequence {

    //  Using HashSet
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] nums = new int[N];
            for(int i=0; i<N; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(nums));
        }
    }
}