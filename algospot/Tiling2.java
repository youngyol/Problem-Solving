// https://algospot.com/judge/problem/read/TILING2

import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int [] dp = new int[101];
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=100; i++)
            dp[i] = (dp[i-2] + dp[i-1])%1000000007;
        while(testCase-->0){
            System.out.println(dp[sc.nextInt()]);
        }
    }
}
