class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let tracker = new Set();
        // console.log(tracker);

        for(let num of nums) {
            if(tracker.has(num)) {
                return true;
            }
            tracker.add(num);
        }
        // console.log(tracker);
        return false;
    
    }
}
