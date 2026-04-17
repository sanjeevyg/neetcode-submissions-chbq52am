class Solution {
    record Box(int r, int c){}
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Box, Set<Character>> squares = new HashMap<>();

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                if(board[r][c] == '.') {
                    continue;
                }

                Box box = new Box(r/3, c/3);
                rows.putIfAbsent(r, new HashSet<>());
                cols.putIfAbsent(c, new HashSet<>());
                squares.putIfAbsent(box, new HashSet<>());
                if(rows.get(r).contains(board[r][c]) || cols.get(c).contains(board[r][c])
                    || squares.get(box).contains(board[r][c])) {
                        return false;
                }

                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                squares.get(box).add(board[r][c]);

            }
        }
        return true;
        
    }
}
