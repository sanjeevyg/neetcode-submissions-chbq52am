class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> bucket = new ArrayList<>();

        for(int i = 0; i < nums.length + 1; i++) {
            bucket.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> e: count.entrySet()) {
            bucket.get(e.getValue()).add(e.getKey());            
        }

        int[] ans = new int[k];
        int idx = 0;

        for(int i = nums.length; i >= 0; i--) {
            for(int n: bucket.get(i)) {
                ans[idx] = n;
                idx++;
                if (idx == k) {
                    return ans;
                }
            }
        }
        return ans;
    }
}
