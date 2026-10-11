import java.util.Arrays;
import java.util.Scanner;

class P2_ClimbingStairs {
// ==========================
    // Brute force approach
// ==========================
    public static int climbingStairs(int n) {
        if(n == 1 || n == 2) return n;
        return climbingStairs(n-1) + climbingStairs(n-2);
    }


// ===========================
    // Memoization
// ===========================
    public static int climbingStairs1(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
    private static int solve(int n, int[] dp) {
        if(n <= 1) return 1; // base-case

        if(dp[n] != -1) { // Return cached result if we already solved this step
            return dp[n];
        }

        dp[n] = solve(n-1, dp) + solve(n-2, dp);
        return dp[n];
    }


// ============================
    // Tabulation
// ============================
    public static int climbingStairs2(int n) {
        if(n <= 1) return 1;
        int prev2 = 1;
        int prev1 = 1;
        for(int i=2; i<=n; i++) {
            int current = prev2 + prev1;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

// Main Method------------>
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of stairs: ");
        int n = sc.nextInt();
        System.out.println(climbingStairs1(n));
    }
}