
import java.util.Arrays;
import java.util.Scanner;


public class InsersionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0; i<N; i++) {
            nums[i] = sc.nextInt();
        }
        // let's suppose initial a value already sorted
        for(int i=1; i<N; i++) {
            int curr = nums[i];
            int prev = i-1;

            while(prev >= 0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                prev--;
            } 
            nums[prev+1] = curr;
        }
        System.out.println(Arrays.toString(nums));
    }
}
