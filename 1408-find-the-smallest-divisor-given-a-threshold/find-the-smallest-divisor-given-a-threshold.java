class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            max = Math.max(nums[i], max);
        }
        int low = 1;
        int high = max;
        int ans = Integer.MAX_VALUE;
        while(low<= high){
            int mid = low + (high - low)/2;
            int val = func(mid, nums);
            if(val <= threshold){
                ans = Math.min(mid, ans);
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public int func(int mid, int [] arr){
        int sum =0;
        for(int i : arr){
            sum += Math.ceil((double)i/mid);
        }
        return sum;
    }
}