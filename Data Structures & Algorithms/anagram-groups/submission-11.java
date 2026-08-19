class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //use map to devise key for each string
        //use common key to list anagrams
        //return values

        Map<String, List<String>> tracker = new HashMap<>();

        for (String str : strs) {
            StringBuilder sb = new StringBuilder();
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            for(char s : arr) {
                sb.append('#').append(s);
            }
            String key = sb.toString();
            tracker.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        // System.out.println(tracker.values());


        return new ArrayList<>(tracker.values());
        // return new ArrayList<>(new ArrayList<>());


    }
}
