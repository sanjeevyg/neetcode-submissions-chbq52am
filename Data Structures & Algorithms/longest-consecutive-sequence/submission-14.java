class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        Set<Integer> tracker = new HashSet<>();

        for(int num : nums) {
            numSet.add(num);
        }

        Iterator<Integer> iterator = numSet.iterator();

        int maxCount = 0;

        while(iterator.hasNext()) {
            int num = iterator.next();
            if(tracker.contains(num)) continue;
            tracker.add(num);
            
            int countLeft = 0;
            int left = num - 1;
            while (numSet.contains(left)) {
                tracker.add(left);
                countLeft++;
                left = left - 1;
            }

            int countRight = 0;
            
            int right = num + 1;
            while(numSet.contains(right)) {
                tracker.add(right);
                countRight++;
                right = right + 1;
            }
            maxCount = Math.max(maxCount, countLeft + countRight + 1);
        }
        return maxCount;
    }
}
