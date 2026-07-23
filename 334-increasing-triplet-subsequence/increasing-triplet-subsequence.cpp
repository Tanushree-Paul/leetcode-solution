class Solution {
public:
    bool increasingTriplet(vector<int>& nums) {
        int i = numeric_limits<int>::max();
        int j = numeric_limits<int>::max();
        for(int k : nums){
            if(k <= i){
                i = k;
            }
            else if(k <= j){
                j = k;
            }
            else 
                return true;
        }
        return false;
    }
};