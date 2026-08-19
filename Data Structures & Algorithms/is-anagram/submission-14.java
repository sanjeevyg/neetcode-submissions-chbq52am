class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> tracker = new HashMap<>();

        for(char _s : s.toCharArray()) {
            tracker.put(_s, tracker.getOrDefault(_s, 0) + 1);
        }

        for(char _t : t.toCharArray()) {
            tracker.put(_t, tracker.getOrDefault(_t, 0) - 1);
        }

        for(int value : tracker.values()) {
            if(value != 0) {
                return false;
            }
        }
        return true;
    };
}
