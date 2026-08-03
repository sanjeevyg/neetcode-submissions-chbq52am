class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        
        for(int num : nums) {
            numSet.add(num);
        }

        int maxCount = 0;
        for(int num : numSet) {
            if(numSet.contains(num - 1)) continue;
            int count = 1;
            int right = num + 1;

            while(numSet.contains(right)) {
                count++;
                right = right + 1;
                // System.out.println(right);
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
