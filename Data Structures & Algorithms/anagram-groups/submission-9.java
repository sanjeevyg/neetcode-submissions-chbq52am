class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Use map to group with same key 
        //use stringBuilder to modify string to create key 
        //return values of the map 

        Map<String, List<String>> anagramG = new HashMap<>();


        for(String s : strs) {
            
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();

            // System.out.println(arr);
            for(char ch : arr) {
                sb.append("#").append(ch);
            }
            String key = sb.toString();
            anagramG.putIfAbsent(key, new ArrayList());
            anagramG.get(key).add(s);
        }
            // System.out.println(anagramG.values());

        return new ArrayList<>(anagramG.values());
    }
}
