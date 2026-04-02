class Solution {
    public int[] getConcatenation(int[] nums) {

        int [] ans = new int[nums.length*2];

        int i = 0;
        int k = 0;
        while(i < 2) {
            for (int j = 0; j < nums.length; j++) {
                ans[k] = nums[j];
                k++;
            }
            i++;
        }

        return ans;


        
    }
}