class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
            
        let count = {};

        for (let num of nums) {
            if (!count[num]) {
                count[num] = 0;
            }
            count[num]++;
        }

        let bucket = Array.from({ length: nums.length + 1 }, () => []);

        for (const [n, freq] of Object.entries(count)) {
            bucket[freq].push(Number(n));
        }

        let ans = [];

        for (let i = nums.length; i >= 0; i--) {
            for (let j of bucket[i]) {
                ans.push(j);
                if (ans.length === k) {
                    return ans;
                }
            }
        }

        return ans
    }
}