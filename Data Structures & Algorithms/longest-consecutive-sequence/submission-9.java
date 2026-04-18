class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();

        for (int num: nums) {
            numsSet.add(num);
        }
        int longest = 0;

        for(int num : nums) {
            int len = 1;
            if(!numsSet.contains(num - 1)) {
                while(numsSet.contains(num + len)) {
                    len++;
                }
            }
            longest = Math.max(longest, len);
        }
        return longest;
    }
}
