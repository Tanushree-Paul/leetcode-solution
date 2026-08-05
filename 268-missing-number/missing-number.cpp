class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int actualSum = 0;
        int expectedSum = nums.size() * (nums.size() + 1 )/ 2;
        for(int i = 0 ; i < nums.size(); i++){
            actualSum += nums[i];
        }
        return expectedSum - actualSum;
    }
};