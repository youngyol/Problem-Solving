// https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result; 
        return helper(numRows);
    }
    
  private List<List<Integer>> helper(int row) {
      List<List<Integer>> result = new ArrayList<>();
      result.add(Arrays.asList(1));
      for (int i = 1; i < row; i++) { 
          List<Integer> line = new ArrayList<>(); 
          for (int j = 0; j <= i; j++) { 
              line.add(pascal(i, j, result.get(i-1)));
          }
          result.add(line);
      }
      return result;
  } 
    
  private int pascal(int row, int col, List<Integer> prevRow) {
      if ((col == 0) || (col == row)) {  
          return 1;
      } else { 
          return prevRow.get(col-1) + prevRow.get(col);
      }
  }
}
