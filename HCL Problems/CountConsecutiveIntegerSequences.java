import java.util.Scanner;
public class CountConsecutiveIntegerSequences {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter N: ");
            int N = sc.nextInt();
            int totalSum = 1, count = 0;
            int start = 1, end = 1;
            while(start <= N) {
                if(totalSum == N) {
                    count++;
                    totalSum -= start;
                    start++;
                } else if(totalSum < N) {
                    end++;
                    totalSum += end;
                } else {
                    totalSum -= start;
                    start++;
                }
            }
            System.out.println("Possible sequences: "+count);
        }
    }
}
