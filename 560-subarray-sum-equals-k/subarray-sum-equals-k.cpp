class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> store;
        store[0] = 1;
        int prefix = 0;
        int count = 0;
        for(int i : nums){
            prefix += i;
            int complement = prefix - k;
            if(store.count(complement) != 0){
                count += store[complement];
            }
            store[prefix]++;
        }
        return count; 
    }
};