import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for(int i=0; i<N; i++) {
            nums[i] = sc.nextInt();
        }
        for(int i=0; i<N-1; i++) {
            int smallestIdx = i;
            for(int j=i+1; j<N; j++) {
                if(nums[j] < nums[smallestIdx]){
                    smallestIdx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[smallestIdx];
            nums[smallestIdx] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
