class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int prefix = 1;
        int[] product = new int[len];
        product[0] = prefix;

        for(int i = 1; i < len; i++) {
            prefix *= nums[i - 1];
            product[i] = prefix;
        }

        int suffix = 1;
        for(int j = len - 2; j >= 0; j--) {
            suffix *= nums[j + 1];
            product[j] *= suffix;
        }

        // System.out.println(Arrays.toString(product));

        // return new int[]{};
        return product;
     
    }
}  
