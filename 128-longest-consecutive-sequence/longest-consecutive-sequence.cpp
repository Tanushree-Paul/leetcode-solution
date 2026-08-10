class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int length = 0;
        unordered_set <int> s;
        for(int i : nums){
            s.insert(i);
        }
        for(int i : s){
            if(s.count(i - 1) == 0){
                int m = i + 1;
                while(s.count(m) != 0){
                    m++;
                }
                length = max(length, m - i);
            }
        }
        return length;
    }
};