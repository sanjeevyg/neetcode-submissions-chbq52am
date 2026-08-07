class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> tracker = new HashMap<>();

        for (char c : s.toCharArray()) {
            tracker.put(c, tracker.getOrDefault(c, 0) + 1);
        }

        for( char c : t.toCharArray()) {
            tracker.put(c, tracker.getOrDefault(c, 0) - 1);
        }

        for(int value : tracker.values()) {
            if(value != 0) {
                return false;
            }
        }

        return true;
       
    };
}
