class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // if (strs.length == 0) return new ArrayList<>("");
        Map<String, List<String>> tracker = new HashMap<>();


        for (String str : strs) {
            StringBuilder sb = new StringBuilder();
            char[] strArray =  str.toCharArray();
            Arrays.sort(strArray);
            for (char s : strArray) {
                sb.append('#').append(s);
            }
            String key = sb.toString();
            // System.out.println(key);
            tracker.putIfAbsent(key, new ArrayList<String>());
            tracker.get(key).add(str);
            // System.out.println(tracker.values());
        }
        return new ArrayList<>(tracker.values());
    }
}
