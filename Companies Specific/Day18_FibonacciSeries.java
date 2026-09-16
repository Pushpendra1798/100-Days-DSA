import java.util.*;
public class Day18_FibonacciSeries {

    public static int fibo(int n, int[] dp) {
        // base case
        if (n <= 1) return n;

        if (dp[n] != -1) return dp[n];

        dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Error: n must be a non-negative number.");
            return;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.print("Fibonacci series up to " + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i, dp) + " ");
        }
        System.out.println();
    }
}