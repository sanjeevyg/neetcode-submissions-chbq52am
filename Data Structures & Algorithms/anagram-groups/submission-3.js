class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let ans = new Map();

        for (let word of strs) {
            let count = new Array(26).fill(0);
            for (let l of word) {
                count[(l).charCodeAt(0) - 'a'.charCodeAt(0)] += 1;
            }
            let key = count.join(',');
            if (!ans.has(key)) {
                ans.set(key, [word]);
            } else {
                ans.get(key).push(word)
            }
            
        }
        return Array.from(ans.values());
    }
}
