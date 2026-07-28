class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character, Integer> alpha = new HashMap<>();

        for (char c : s.toCharArray()) {
            alpha.put(c, alpha.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            alpha.put(c, alpha.getOrDefault(c, 0) - 1);
        }

        for (int v : alpha.values()) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    };
}
