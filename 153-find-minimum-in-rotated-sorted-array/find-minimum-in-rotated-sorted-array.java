class Solution {
    public int findMin(int[] nums) {
        // int low = 0;
        // int high = nums.length - 1;
        // int find = Integer.MAX_VALUE;
        // while(low <= high){
        //     int mid = low + (high - low)/2;
        //     if(nums[low] <= nums[mid]){
        //         find = Math.min(find, nums[low]);
        //         low = mid + 1;
        //     }
        //     else{ 
        //         find = Math.min(find, nums[mid]);
        //         high = mid - 1;
        //     }
        // }
        // return find;

        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] < nums[high]){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return nums[low];
    }
}