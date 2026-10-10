import java.util.*;
class Day21_4Sum {
    public static List<List<Integer>> a4Sum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<n; ) {
                int p = j+1;
                int q = n-1;
                while(p < q) {

                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[p] + (long)nums[q];

                    if(sum < target) {
                        p++;
                    } else if(sum > target) {
                        q--;
                    } else {
                        list.add(List.of(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;
                        while(p < q && nums[p]==nums[p-1])p++;
                    }
                }
                j++;
                while(j < n && nums[j] == nums[j-1])j++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i=0; i<N; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(a4Sum(nums, target));
    }
}