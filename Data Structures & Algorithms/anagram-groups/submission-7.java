class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       //Make key by adding the numbers
       //Stringfy them and use them as key
       //Use HashMap as the tracker

       Map<String, List<String>> tracker = new HashMap();

       for(String str : strs) {
        int[] counts = new int[26];

        for (char s : str.toCharArray()) {
            counts[s -'a']++;
        }

        StringBuilder keyBuilder = new StringBuilder();

        for(int c : counts) {
            keyBuilder.append('#').append(c);
        }

        String key = keyBuilder.toString();

        tracker.putIfAbsent(key, new ArrayList<>());


        tracker.get(key).add(str);

        // System.out.println(keyBuilder);
       }

       return new ArrayList<>(tracker.values());

    

    }
}
