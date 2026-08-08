class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count = 0;
        int maximum = 0;
        for(int i : nums){
            if(i == 1){
                count++;
            }
            maximum = max(maximum, count);
            if(i == 0) count = 0;
        }
        return maximum;
    }
};