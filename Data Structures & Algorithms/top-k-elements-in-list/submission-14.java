class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> tracker = new HashMap<>();

        for(int num : nums) {
            tracker.put(num, tracker.getOrDefault(num, 0) + 1);
        }


        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(tracker.entrySet());   
        
        entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        // System.out.println(entries);

        int [] result = new int[k];

        int count = 0;
        while (count < k) {
            result[count] = entries.get(count).getKey();
            count++;
        }
       return result;
    }
}
