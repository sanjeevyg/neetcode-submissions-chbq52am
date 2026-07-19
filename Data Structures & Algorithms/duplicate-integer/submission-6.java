
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> _s = new HashSet<>();
        // System.out.println(_s);

        for (int num : nums) {
            _s.add(num);
        }
        
        return _s.size() != nums.length;
   
    }
}