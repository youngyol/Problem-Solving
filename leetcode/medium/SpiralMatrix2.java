// https://leetcode.com/problems/spiral-matrix-ii/description/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] dir = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} }; // 0, 1 ,2,3
        boolean[][] visited = new boolean[n][n];
        int r = 0, c = 0, di = 0;
        int[][] answer = new  int[n][n];
        
        int direction = 0, rNext, cNext;
        int sumOfElements = n*n;
        int value = 1;
        
        for(int i = 0; i<sumOfElements ; ){
            if(!visited[r][c]){
                visited[r][c]=true;
                answer[r][c]=value++;
                 i++;
            }

            rNext = r + dir[direction][0];
            cNext = c +dir[direction][1];

            if( (rNext<   0 || rNext >= n || cNext< 0 || cNext>= n) ){
                direction = (direction+1)%4;
            }
            else{
                if(visited[rNext][cNext] )
                    direction = (direction+1)%4;
                else {
                    r += dir[direction][0];
                    c += dir[direction][1];
                }
            }

        }

        return answer;
    } 
}
