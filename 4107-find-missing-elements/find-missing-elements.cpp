class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        unordered_set <int> unique;
        vector <int> missing;
        int max = *max_element(nums.begin(), nums.end());
        int min = *min_element(nums.begin(), nums.end());
        for(int i: nums){
            unique.insert(i);
        }
        for(int i = min; i <= max; i++){
            if(!unique.count(i)) missing.push_back(i);
        }
        return missing;
    }
};