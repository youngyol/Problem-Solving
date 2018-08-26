// https://leetcode.com/problems/spiral-matrix/description/


class Solution {
  public   List<Integer> spiralOrder(int[][] matrix) {
        int[][] dir = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} }; // 0, 1 ,2,3
      
        if(matrix.length == 0) return new ArrayList<Integer>();
        int rows = matrix.length, cols = matrix[0].length;
        
        boolean[][] visited = new boolean[rows][cols];
        int r = 0, c = 0, di = 0;

        List<Integer> answer = new ArrayList();
        int direction = 0, rNext, cNext;
        int sumOfElements = rows * cols;
        for(int i = 0; i<sumOfElements ; ){
            if(!visited[r][c]){
                visited[r][c]=true;
                answer.add(matrix[r][c]);
                 i++;
            }



            rNext = r + dir[direction][0];
            cNext = c +dir[direction][1];

            if( (rNext<   0 || rNext >= rows || cNext< 0 || cNext>= cols) ){
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
