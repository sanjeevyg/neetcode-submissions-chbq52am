class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // System.out.println(n);

        int[] ans = new int[n];
        Arrays.fill(ans, 1);

        int prefix = 1;
        for(int i = 0; i < nums.length; i++) {
            ans[i] = prefix;
            prefix = nums[i] * prefix;
        }

        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix = nums[i] * suffix;
        }

        System.out.println(Arrays.toString(ans));
        return ans;
        
    }
}  
