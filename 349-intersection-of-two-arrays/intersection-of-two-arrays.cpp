class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> common;
        unordered_set<int> set1(nums1.begin(), nums1.end());

        for(int num : nums2){
            if(set1.count(num)){
                common.insert(num);
            }
        }
        return vector<int>(common.begin(), common.end());
    }
};