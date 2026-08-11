import java.util.*;
class Day07_ProductOfArrayExceptSelf {


    // First basic approach  [ It fails when there is 0 in array]
    public static int[] productOfElements(int[] nums) {
        int n = nums.length;
        int product = 1;
        int[] result = new int[n];
        for(int num : nums) {
            product *= num;
        }
        for(int i=0; i<n; i++) {
            result[i] = product / nums[i];
        }
        return result;
    }



    // Second BruteForce - using nested [ loop Time  = O(n²) , Space = O(1) extra ]
    public static int[] productOfElements1(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0; i<n; i++) {
            result[i] = 1;
            for(int j=0; j<n; j++) {
                if(i!=j)
                result[i] *= nums[j];
            }
        }
        return result;
    }




    // Third Optimal approach - using prefix and sufix [ loop Time  = O(n) , Space = O(1) extra ]
    public static int[] productOfElements2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // prefix product
        result[0] = 1;
        for(int i=1; i<n; i++) {
            result[i] = result[i-1]*nums[i-1];
        }

        // sufix product
        int sufix = 1;
        for(int i=n-1; i>=0; i--) {
            result[i] = result[i] * sufix;
            sufix = sufix*nums[i];
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
            System.out.println("Products: " + Arrays.toString(productOfElements2(nums)));
        }
    }
}
