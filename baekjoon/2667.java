// https://www.acmicpc.net/problem/2667

import java.util.*;

public class Main {
    private static final int [][] DIRECTION =  {{-1,0},{0,-1},{1,0},{0,1}};
    private static  int N ;
    private static boolean[][] visited = new boolean[25][25];
    private static List<Integer> result = new ArrayList<>();

    private static   int [][] board = new int[25][25];


     public static void main(String...args) {
         Scanner sc = new Scanner(System.in);
         N = sc.nextInt();
         for(int i=0; i<N; i++){
             String s = sc.next();
             for(int j=0; j<N; j++)
                 board[i][j] = s.charAt(j)-48;
         }

         for(int i = 0; i< N; i++) {
             for (int j = 0; j < N; j++){
                 if(board[i][j] == 1 && !visited[i][j] ){
                     result.add(bfs(i,j));
                 }
             }
         }

         System.out.println(result.size());
         Collections.sort(result);
         for(Integer ans : result)
             System.out.println(ans);

    }

    private static int bfs(int i, int j) {
        int cnt = 0;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i,j));

        visited[i][j] = true;
        cnt++;
        while(!queue.isEmpty()){
            Point cur = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nextX = cur.x + DIRECTION[k][0];
                int nextY = cur.y + DIRECTION[k][1];
                if (0 <= nextX && nextX < N && 0 <= nextY && nextY < N &&
                        board[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                    queue.add(new Point(nextX,nextY));
                    visited[nextX][nextY] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static class Point {
        final int x;
        final int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
