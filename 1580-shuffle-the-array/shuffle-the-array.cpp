class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector <int> ans(2 * n);
        int increment1 = 0;
        for(int i = 0; i < n; i++){
            ans[increment1] = nums[i];
            increment1 += 2; 
        }
        int increment2 = 1;
        for(int i = n; i < 2*n; i++){
            ans[increment2] = nums[i];
            increment2 += 2;
        }
        return ans;
    }
};