class Solution {
    public int[] transformArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                nums[i] = 1;
            }
            else{
                nums[i] = 0;
            }
        }
        int count = 0;
        for (int x : nums){
            if(x == 0){
                count++;
            }
        }
        for(int i = 0; i < count; i++){
            nums[i] = 0;
        }
        for(int i = count; i < nums.length; i++){
            nums[i] = 1;
        }
        return nums;
    }
}