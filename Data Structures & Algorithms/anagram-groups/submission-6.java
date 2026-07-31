class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> tracker = new HashMap<>();

        for(String str : strs) {
            char[] keyBuilder = str.toCharArray();
            Arrays.sort(keyBuilder);

            String key = new String(keyBuilder);

            tracker.putIfAbsent(key, new ArrayList<>());
            tracker.get(key).add(str);
        }

        return new ArrayList<>(tracker.values());
    }
}
