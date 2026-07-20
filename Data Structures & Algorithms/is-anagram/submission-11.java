class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> _s = new HashMap<>();
        // Map<Character, Integer> _t = new HashMap<>();

        for (char c : s.toCharArray()) {
            _s.put(c, _s.getOrDefault(c, 0) + 1);
        }
        // System.out.println(_s);

        for(char c : t.toCharArray()) {
            _s.put(c, _s.getOrDefault(c, 0) - 1);
        }

        for(Map.Entry<Character, Integer> entry : _s.entrySet()) {
            Integer value = entry.getValue();
            if (value != 0) {
                return false;
            }
        }

        // System.out.println(_s);



       return true;
    };
}
