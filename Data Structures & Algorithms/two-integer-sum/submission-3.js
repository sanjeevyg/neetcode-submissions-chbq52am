class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let check = {};

        for (let i = 0; i < nums.length; i++) {
            let com = target - nums[i];
            if (com in check) {
                return [i, check[com]].sort()
            }
            check[nums[i]] = i;
        }
    }
}
