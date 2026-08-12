class Solution {
    public int majorityElement(int[] nums) {
        int major = 0 , count = 0;

        for (int num : nums){
            if (count == 0){
                count = 1;
                major = num;
            }            
            else if (num == major) count ++;
            else count--;
        }
        return major ;

        // beware
        // int major = nums[0];
        // for(int i = 1; i < nums.length; i++){
        //     int count = 1;
        //     if(nums[i] == major) count++;
        //     else count--;
        //     if(count <= 0) major = nums[i];
        // }
        // return major;
    }
}