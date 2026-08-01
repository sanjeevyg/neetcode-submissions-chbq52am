class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> tracker = new HashMap<>();

       for(int num : nums ) {
        tracker.put(num, tracker.getOrDefault(num, 0) + 1);
       }

       List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(tracker.entrySet());

       entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

       int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }
       return result;
    }
}
