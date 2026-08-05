class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0; 
        int right = heights.length - 1;

        while (left < right) {
            int shortHeight = Math.min(heights[left], heights[right]);
            int area = shortHeight * (right - left);
            maxWater = Math.max(maxWater, area);

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
