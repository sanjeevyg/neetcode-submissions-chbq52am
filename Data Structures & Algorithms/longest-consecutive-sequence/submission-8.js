class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        const numsSet = new Set(nums);
        let longest = 0;

        for(let num of nums) {
            let len = 1;
            if (!numsSet.has(num - 1)) {
                while (numsSet.has(num + len)) {
                    len++;
                }
            }
            longest = Math.max(longest, len);
        }
        return longest;
    }
}
