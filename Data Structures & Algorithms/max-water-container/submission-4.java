class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0; 
        int right = heights.length - 1;

        while (left < right) {
            int shortBar = Math.min(heights[left], heights[right]);
            int water = shortBar * (right - left);
            maxWater = Math.max(maxWater, water);

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
