class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //use map to track the most frequent elements 
        //sort the map and return the top k 
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());

        entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int[] ans = new int[k];

        // System.out.println(entries);
        for (int i = 0; i < k; i++)  {
            ans[i] = entries.get(i).getKey();
        }

        return ans;
    }
}
