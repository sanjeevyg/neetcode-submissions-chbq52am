
class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();

        for (int num: nums) {
            if (seen.contains(num)) {
                return true; 
            }
            seen.add(num);
        }
        return false;
    }
}