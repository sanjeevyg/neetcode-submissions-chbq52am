class Solution {
    /**
     * @param {string[]} strs
     * @return {string}
     */
    longestCommonPrefix(strs) {
        if(strs.length == 0) {
            return "";
        }

        for(let i = 0; i < strs[0].length; i++) {
            let ch = strs[0][i];
            for(let s of strs) {
                if(i >= s.length || s[i] != ch) {
                    return s.substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
