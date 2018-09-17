// https://algospot.com/judge/problem/read/ASYMTILING


import java.util.Scanner;

public class Main {
    public static final int INF = 1000000007;
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] dp = new int[101], sym = new int[101];
        dp[1] = 1; dp[2] = 2;
        sym[1] = 1;  sym[2] = 2;

        for (int i = 3; i <= 100; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % INF;
            sym[i] = (i % 2 == 0) ? (dp[i / 2] + dp[(i - 2) / 2]) % INF :
                    dp[(i - 1) / 2] % INF;
        }
        while (testCase-- > 0) {
            int n = sc.nextInt();
            System.out.println((INF+dp[n] - sym[n])%INF);
        }
    }
}
