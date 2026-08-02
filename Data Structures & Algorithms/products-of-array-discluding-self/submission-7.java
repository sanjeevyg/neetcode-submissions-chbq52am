class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] product = new int[len];

        product[0] = 1;

        for(int i = 1; i < nums.length; i++) {
            product[i] = product[i - 1] * nums[i - 1];
        }

        // System.out.println(Arrays.toString(product));
        int suffix = 1;
        for(int j = len - 2; j >= 0; j--) {
            suffix *= nums[j + 1];
            product[j] = product[j] * suffix;
        }
        
        // System.out.println(Arrays.toString(product));
        return product;
    }
}  
