class Solution {
    public int missingInteger(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int prefixSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] == 1){
                prefixSum += nums[i];
            }
            else{
                break;
            }
        }
        int no = prefixSum;
        while(set.contains(no)){
            no++;
        }
        return no;
    }
}