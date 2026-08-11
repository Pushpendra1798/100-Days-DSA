import java.util.Scanner;
public class Day06_MajorityElement {
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

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no. of elements: ");
            int N = sc.nextInt();
            int[] nums = new int[N];
            System.out.print("Enter elements: ");
            for(int i=0; i<N; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println("Mejority element: " + mejorityElement(nums));
        }
    }
}
