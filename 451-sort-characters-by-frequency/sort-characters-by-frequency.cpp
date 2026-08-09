class Solution {
public:
    string frequencySort(string s) {
        unordered_map <char, int> map;
        for(char ch : s){
            map[ch]++;
        }
        priority_queue <pair <int, char>> pq;
        for(auto& [ch, freq] : map){
            pq.push({freq, ch});
        }

        string ans = "";
        while(!pq.empty()){
            auto [freq, ch] = pq.top();
            pq.pop();
            while(freq > 0){
                ans += ch;
                freq--;
            }
        }
        return ans;
    }
};