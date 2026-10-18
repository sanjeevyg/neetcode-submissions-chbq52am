class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        for(char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        };
        // System.out.println(count);

        for(char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) - 1);
        }

        System.out.println(count);
        for(Map.Entry<Character, Integer> e : count.entrySet()) {
            int c = e.getValue();
            // System.out.println(c);
            if(c != 0) {
                return false;
            }
        }

        return true;

        



    };
}
