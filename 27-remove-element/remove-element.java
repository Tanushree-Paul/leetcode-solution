class Solution {
    public int removeElement(int[] nums, int val) {
        int j = -1;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }
}