class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, 0, nums.length - 1, target);
        if(lb == nums.length || nums[lb] != target ) return new int []{-1, -1};
        return new int []{lb, upperBound(nums, 0, nums.length - 1, target) - 1};
    }
    public int lowerBound (int [] num, int low, int high , int x){
        int ans = num.length;
        while(low <= high){
            int mid= low + (high - low)/2;
            if(num[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int upperBound (int [] num, int low, int high , int x){
        int ans = num.length;
        while(low <= high){
            int mid= low + (high - low)/2;
            if(num[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}