class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> ans = new HashMap<>();

        for (String word: strs) {
            int[] count = new int[26];
            for (char l : word.toCharArray()) {
                count[l - 'a']++;
            }
            String key = Arrays.toString(count);
            if(!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(word);
        }
        return new ArrayList<>(ans.values());

    }
}
