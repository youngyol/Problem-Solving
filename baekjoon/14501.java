// https://www.acmicpc.net/problem/14502

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    private static int[] result;
    private static int[][] consulting;
    private static int end;
    private static final int TIME = 0, PAY = 1;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        end = Integer.parseInt(br.readLine());
        result = new int[end + 1];
        consulting = new int[2][end];

        StringTokenizer st;

        for (int day = 0; day < end; day++) {
            st = new StringTokenizer(br.readLine());
            consulting[TIME][day] = Integer.parseInt(st.nextToken());
            consulting[PAY][day] = Integer.parseInt(st.nextToken());
        }

        result[end] = 0;

        for (int i = end - 1; i >= 0; i--) {
            int nextDay = i + consulting[TIME][i];
            result[i] = (nextDay > end)
                    ? result[i + 1] : Math.max(result[i + 1], result[nextDay] + consulting[PAY][i]);
        }
        
        System.out.print(result[0]);
    }
}
