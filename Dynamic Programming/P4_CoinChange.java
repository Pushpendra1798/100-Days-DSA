import java.util.Scanner;

public class P4_CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if(amount < 1) return 0;
        int[] minCoinsDP = new int[amount+1];
        for(int i=1; i<=amount; i++) {
            minCoinsDP[i] = Integer.MAX_VALUE;
            for(int coin : coins) {
                if(coin <= i && minCoinsDP[i-coin] != Integer.MAX_VALUE) {
                    minCoinsDP[i] = Math.min(minCoinsDP[i], 1+minCoinsDP[i-coin]);
                }
            }
        }
        return minCoinsDP[amount] != Integer.MAX_VALUE ? minCoinsDP[amount] : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of coins: ");
        int N = sc.nextInt();
        int[] coins = new int[N];
        System.out.print("Enter coins: ");
        for(int i=0; i<N; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        System.out.println("Minimum no. of coins: " + coinChange(coins, amount));
    }
}
