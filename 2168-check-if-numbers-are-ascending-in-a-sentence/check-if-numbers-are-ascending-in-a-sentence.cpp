class Solution {
public:
    bool areNumbersAscending(string s) {
        // stringstream ss (s);
        // string word;
        // int prev = -1;
        // while(ss >> word){
        //     if(isdigit(word[0])){
        //         int num = stoi(word);
        //         if(prev >= num) return false;
        //         prev = num;
        //     }
        // }
        // return true;

        int prev = -1;
        int i = 0;
        int n = s.size();

        while(i < n){
            if(isdigit(s[i])){
                int num = 0;
                while(i < n && isdigit(s[i])){
                    num = num * 10 + (s[i] - '0');
                    i++;
                }
                if(prev >= num) return false;
                prev = num;
            }
            else{
                i++;
            }
        }
        return true;
    }
};