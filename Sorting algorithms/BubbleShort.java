
import java.util.Arrays;
import java.util.Scanner;

public class BubbleShort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0; i<N; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<N-1; i++) {
            for(int j=0; j<N-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    } 
}
