class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> check = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (check.containsKey(com)) {
                int []arr = {check.get(com), i};
                Arrays.sort(arr);
                return arr;
            }
            check.put(nums[i], i);
        }
        return new int[] {};
    }
}
