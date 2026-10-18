class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tracker = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if(tracker.containsKey(comp)) {
                return new int[] {tracker.get(comp), i};
            }
            tracker.put(nums[i], i);
        }
        return new int[]{};
    }
}
