class Solution {
    /**
     * @param {string} s
     * @return {number}
     */
    lengthOfLongestSubstring(s) {
        let longest = 0;
        let seen = new Set();
        let left = 0;

        for(let right = 0; right < s.length; right++) {
            while (seen.has(s[right])) {
                seen.delete(s[left]);
                left++;
            }

            seen.add(s[right]);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
