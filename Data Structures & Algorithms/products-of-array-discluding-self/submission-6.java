class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] suffix = new int[len];

        int[] product = new int[len];

        int pre = 1;
        int suf = 1;

        prefix[0] = 1;
        suffix[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            pre *= nums[i - 1];
            prefix[i] = pre;
        }

        for(int j = len - 2; j >= 0; j--) {
            // System.out.println(j);
            suf *= nums[j + 1];
            suffix[j] = suf;
        }

        for(int m = 0; m < nums.length; m++) {
            product[m] = prefix[m] * suffix[m];
        }
        // System.out.println(Arrays.toString(suffix));
        return product;
    }
}  
