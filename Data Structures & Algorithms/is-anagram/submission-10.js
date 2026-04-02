class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if (s.length != t.length) {
            return false;
        }

        let freq = {};

        for( let ch of s) {
            if (!freq[ch]) {
                freq[ch] = 1;
            } else {
                freq[ch] += 1;
            }
        }

        for (let ch of t) {
            if (!ch in freq) return false
            freq[ch] -= 1;
        }

        for (const v of Object.values(freq)) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}
