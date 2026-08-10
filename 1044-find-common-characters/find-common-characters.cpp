class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        vector <int> map(26);
        for(char ch : words[0]){
            map[ch - 'a']++;
        }

        for(int i = 1 ; i < words.size(); i++){
            vector <int> freq (26);
            for(char ch: words[i]){
                freq[ch - 'a']++;
            }

            for(int j = 0 ; j < 26; j++){
                map[j] = min(map[j], freq[j]);
            }
        }

        vector<string> ans;
        for(int i = 0 ; i < 26; i++){
            int count = map[i];
            while(count > 0){
                ans.push_back(string(1, (char)(i + 'a')));
                count--;
            }
        }
        return ans;
    }
};