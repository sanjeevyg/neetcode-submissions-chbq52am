class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Get prefixProduct for each number and store in array 
        //get suffixProduct for each number and store in array
        //Return new array with the value of each element = prefixP * suffixP
        int len = nums.length - 1;
        int[] preP = new int[len + 1];
        preP[0] = 1;
        int[] sufP = new int[len + 1];
        sufP[len] = 1;


        int prePro = 1;
        int sufPro = 1;

        for (int i = 1; i <= len; i++) {
            prePro *= nums[i - 1];
            preP[i] = prePro;
        }

        for (int j = len - 1; j >= 0; j--) {
            sufPro *= nums[j + 1];
            sufP[j] = sufPro;
        }

        int[] ans = new int[len + 1];

        for(int k = 0; k <= len; k++) {
            ans[k] = sufP[k] * preP[k];
        }

        // System.out.println(Arrays.toString(preP));
        return ans;
     
    }
}  
