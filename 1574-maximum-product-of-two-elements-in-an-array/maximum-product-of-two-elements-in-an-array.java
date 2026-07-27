class Solution {
    public int maxProduct(int[] nums) {
        int first = nums[0];
        int k = 1;
        int last = -1;
        while(k < nums.length){
            if(nums[k] > first){
                last = first;
                first = nums[k];
            }
            else if(nums[k] > last){
                last = nums[k];
            }
            k++;
        }
        return (last-1) * (first-1);
    }
}