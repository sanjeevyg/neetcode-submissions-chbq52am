class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();

        for (int num : nums) {
            res.put(num, res.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(res.entrySet());

        entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        System.out.println(entries);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = entries.get(i).getKey();
        }
        return ans;
    }
}
