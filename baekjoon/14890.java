// https://www.acmicpc.net/problem/14890


import java.util.Scanner;
 
public class Main {
    private static int N,L;
    private static int[][] arr;
    private static int path = 0;
    public static void main(String...args){
        Scanner sc = new Scanner(System.in); 
        N = sc.nextInt();
        L = sc.nextInt();
        arr = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            if(solve(0,i, true)) {
                path++;
            }
            if(solve(i,0, false)) {
                path++;
            }
        }

        System.out.println(path);
    }

    private static boolean solve(int x, int y ,boolean isTopDown) {
        int prev=-1, sameCnt=0;
        for(int i=0; i<N;){
            int cur = isTopDown? arr[i][y] :arr[x][i] ;
            if(prev==-1) {
                prev=cur;
                sameCnt=1;
                i++;
                continue;
            }
            if(prev <cur){
                if(prev+1 < cur || sameCnt < L ) return false;
                prev = cur;
                sameCnt=1;
                i++;
            } else if (prev==cur){
                sameCnt++;
                i++;
            } else{
                if(prev-1 != cur || i+L-1 >= N )  return false;
                int j=i;
                sameCnt=0;
                for(; j<=i+L-1; j++) {
                    int next = isTopDown? arr[j][y] : arr[x][j];
                    if(cur != next) return false;
                    sameCnt++;
                }
                if(sameCnt<L) return false;
                prev = cur;
                i+=L;
                sameCnt=0;
            }
        }
        return  true;
    }
}
