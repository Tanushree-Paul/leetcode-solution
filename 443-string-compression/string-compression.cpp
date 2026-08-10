class Solution {
public:
    int compress(vector<char>& chars) {
        int idx = 0;
        for(int i = 0; i < chars.size(); i++){
            char ch = chars[i];
            int count = 0;
            while(i < chars.size() && chars[i] == ch){
                count++;
                i++;
            }
            chars[idx++] = ch;
            if(count > 1){
                string s = to_string(count);
                for(char ch : s){
                    chars[idx++] = ch;
                }
            }
            i--;
        }
        return idx;
    }
};