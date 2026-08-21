class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            System.out.println("loop above: " + i);
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            // System.out.println("loop below : " + i);

            while(j < k) {

                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while(j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                }
                if(sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            // System.out.println("result : " + result);
        }
        return result;
    }
}
