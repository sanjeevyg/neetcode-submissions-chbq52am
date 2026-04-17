class Solution {
    /**
     * @param {character[][]} board
     * @return {boolean}
     */
    isValidSudoku(board) {
        let seen  = new Set();

        for(let r = 0; r < 9; r++) {
            for(let c = 0; c < 9; c++) {
                let val = board[r][c];
                if(val == '.') continue;

                let rowKey = val + 'rowKey' + r;
                let colKey = val + 'colKey' + c;
                let squareKey = val + 'squareKey' + Math.floor(r/3) + '-' + Math.floor(c/3);

                if(seen.has(rowKey)  || seen.has(colKey) || seen.has(squareKey)) {
                    return false;
                }
                seen.add(rowKey);
                seen.add(colKey);
                seen.add(squareKey);
            }
        }
        return true;
    }
}
