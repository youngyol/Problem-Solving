// https://www.acmicpc.net/problem/7576

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int col, row;
    private static final int [][] DIRECTION =  {{-1,0},{0,-1},{1,0},{0,1}};


    public static void main(String...args){

        Scanner sc = new Scanner(System.in);
        col = sc.nextInt();
        row = sc.nextInt();

        int[][] tomato = new int[row][col];


        for(int i = 0; i< row; i++) {
            for (int j = 0; j < col; j++)
                tomato[i][j] = sc.nextInt();
        }

        int day = bfs(tomato);
        if(isInZero(tomato)) System.out.println("-1");
        else  System.out.println((day==0)?day:day-1);


    }

    private static boolean isInZero(int[][] tomato) {
        for(int i = 0; i< row; i++) {
            for (int j = 0; j < col; j++){
                if(tomato[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int bfs(int[][] tomato) {
        int max = 0;
        Queue<Point> queue = new LinkedList<>();
        for(int i = 0; i< row; i++) {
            for (int j = 0; j < col; j++){
                if(tomato[i][j] == 1) queue.add(new Point(i,j));
            }
        }
        while(!queue.isEmpty()){
            Point cur = queue.poll();
            int curDay = tomato[cur.x][cur.y];
            for (int k = 0; k < 4; k++) {
                int nextX = cur.x + DIRECTION[k][0];
                int nextY = cur.y + DIRECTION[k][1];

                if (0 <= nextX && nextX < row && 0 <= nextY && nextY < col && tomato[nextX][nextY] == 0) {
                        tomato[nextX][nextY] = curDay+1;
                        queue.add(new Point(nextX,nextY));
                        max = (max<curDay+1)?curDay+1:max;
                }
            }
        }
        return max;
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
