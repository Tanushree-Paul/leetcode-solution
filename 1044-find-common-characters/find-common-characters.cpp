class Solution {
public:
    vector<string> commonChars(vector<string>& words) {
        // vector <int> map(26);
        // for(char ch : words[0]){
        //     map[ch - 'a']++;
        // }

        // for(int i = 1 ; i < words.size(); i++){
        //     vector <int> freq (26);
        //     for(char ch: words[i]){
        //         freq[ch - 'a']++;
        //     }

        //     for(int j = 0 ; j < 26; j++){
        //         map[j] = min(map[j], freq[j]);
        //     }
        // }

        // vector<string> ans;
        // for(int i = 0 ; i < 26; i++){
        //     int count = map[i];
        //     while(count > 0){
        //         ans.push_back(string(1, (char)(i + 'a')));
        //         count--;
        //     }
        // }
        // return ans;

        

        unordered_map <char, int> map;

        // Store frequency of first word
        for (char ch : words[0]) {
            map[ch]++;
        }

        // Compare with every other word
        for (int i = 1; i < words.size(); i++) {

            unordered_map <char, int>freq;

            // Frequency of current word
            for (char ch : words[i]) {
                freq[ch]++;
            }

            // Update map with minimum frequency
            for (auto& [ch, count] : map) {
                if (freq.count(ch)) {
                    count = min(count, freq[ch]);
                }
                else count = 0;
            }
        }

        // Create answer
        vector<string> ans;

        for (auto& [ch, count] : map) {
            while (count > 0) {
                ans.push_back(string(1, ch));
                count--;
            }
        }

        return ans;

    }
};