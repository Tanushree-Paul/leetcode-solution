class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string prefix = strs[0];
        for(int i = 1; i < strs.size(); i++){
            while(!strs[i].starts_with(prefix)){
                prefix = prefix.substr(0, prefix.size() - 1);
            }
        }
        return prefix;
    }
};