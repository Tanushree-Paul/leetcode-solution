class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int left = 0;
        int right = k -1;
        long sum = 0;
        long maxSum = 0;
        for (int i = left; i <= right; i++){
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if(map.size() == k){
            maxSum = sum;
        }
        
        while(right < n - 1){
            //remove left element 
            sum -= nums[left];
            map.put(nums[left], map.get(nums[left]) - 1);
            if(map.get(nums[left]) == 0){
                map.remove(nums[left]);
            }
            left++;
            //add right elements
            right++;
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            if(map.size() == k){
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}