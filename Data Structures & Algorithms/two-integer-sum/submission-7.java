class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tracker = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if(tracker.containsKey(compliment)) {
                return new int[]{tracker.get(compliment), i};
            }
            tracker.putIfAbsent(nums[i], i);
        }

        return new int [] {};

    }
}
