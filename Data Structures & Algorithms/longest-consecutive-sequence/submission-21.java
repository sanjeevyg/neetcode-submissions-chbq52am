class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int maxLen = 1;
        Set<Integer> seen = new HashSet<>();

        for(int num : nums) {
            seen.add(num);
        }

        for(int num : nums) {
            if(seen.contains(num - 1)) continue;
            int len = 1;

            int current = num + 1;

            while(seen.contains(current)) {
                len++;
                current = current + 1;
            }

            maxLen = Math.max(len, maxLen);
        }

        return maxLen;
    }
}
