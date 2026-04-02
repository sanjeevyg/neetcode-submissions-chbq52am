class Solution {
    public int[] getConcatenation(int[] nums) {

        int [] ans = new int[nums.length*2];

        
        for (int j = 0; j < nums.length; j++) {
            ans[j] = nums[j];
            ans[j + nums.length] = nums[j];
        }

        return ans;
    }
}