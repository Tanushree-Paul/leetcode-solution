class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length - 1;
        int left = 0;
        int right = k - 1;
        int sum = 0;
        for (int i = left; i <= right; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        while (right < n){
            sum -= nums[left];
            left++;
            right++;
            sum += nums[right];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum /k ;
    }
}