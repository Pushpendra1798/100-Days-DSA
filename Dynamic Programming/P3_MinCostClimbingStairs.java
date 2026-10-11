import java.util.*;
public class P3_MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev2 = 0, prev1 = 0;
        for(int i=2; i<=n; i++) {
            int current = Math.min(prev2+cost[i-2], prev1+cost[i-1]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of stairs: ");
        int N = sc.nextInt();
        int[] cost = new int[N];
        System.out.print("Enter the cost of stars: ");
        for(int i=0; i<N; i++) {
            cost[i] = sc.nextInt();
        }

        System.out.println(minCostClimbingStairs(cost));
    }
}
