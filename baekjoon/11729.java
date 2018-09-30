// https://www.acmicpc.net/problem/11729
import java.util.Scanner;

public class Main {
    public static void main(String...arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt =1;
        for(int i=0; i<n; i++)
            cnt*=2;
        cnt-=1;
        System.out.println(cnt);
        move(n, 1, 3, 2);
    }

    private static void move(int n, int src, int dest, int other) {
        if(n==1){
            System.out.println(src+" "+dest);
        } else {
            move(n - 1, src, other, dest);
            System.out.println(src + " " + dest);
            move(n - 1, other, dest, src);
        }
    }
}
