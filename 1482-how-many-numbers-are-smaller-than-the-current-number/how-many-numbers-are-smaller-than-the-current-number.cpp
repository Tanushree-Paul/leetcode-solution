class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector <int> freq(101, 0);
        for(int num : nums){
            freq[num]++;
        }
        int count = 0;
        for(int i = 0; i < 101; i++){
            int temp = freq[i];
            freq[i]= count;
            count += temp;
        }
        vector <int> ans;
        for(int num : nums){
            ans.push_back(freq[num]);
        }
        return ans;
    }
};