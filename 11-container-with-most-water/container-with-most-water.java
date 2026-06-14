class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int width = right - left;
            int min = Math.min(height[left], height[right]);
            int currQuant = min * width;
            maxArea = Math.max(maxArea, currQuant); 
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
