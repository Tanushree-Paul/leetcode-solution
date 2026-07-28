class Solution {
    public String smallestPalindrome(String s) {
        int [] freq = new int [26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        char [] word = new char [s.length()];
        int left = 0;
        int right = s.length() - 1;
        for(int i = 0; i < 26; i++){
            while(freq[i] >= 2){
                word[left++] = (char) (i + 'a');
                word[right--] = (char) (i + 'a');
                freq[i] -= 2;
            }
            if(freq[i] == 1){
                word[s.length() / 2] = (char) (i + 'a');
            }
        }
        return new String(word);
    }
}