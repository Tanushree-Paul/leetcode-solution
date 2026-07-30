class Solution {
public:
    int minimumPushes(string word) {
       int comp = word.length() / 8;
       int rem = word.length() % 8;
       return 8 * comp * (comp + 1 )  / 2 + rem * (comp +1);
    }
};