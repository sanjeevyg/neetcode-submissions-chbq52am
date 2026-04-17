class Solution {
    public boolean isValidSudoku(char[][] board) {
      Set<String> seen = new HashSet<>();

      for(int r = 0; r < 9; r++) {
        for(int c = 0; c < 9; c++) {
            char num = board[r][c];

            if (num == '.') continue;

            String rowKey = num + "rowKey" + r;
            String colKey = num + "colKey" + c;
            String squareKey = num + "squareKey" + r/3 + '-' + c/3;

            if(!seen.add(rowKey) || !seen.add(colKey) || !seen.add(squareKey)) {
                return false;
            }
        }
      }
      return true;
        
    }
}
