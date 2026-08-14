class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int right = 0;
        int freq [] = new int [26];
        int len = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            int index = ch - 'a';
            freq[index]++;
            while (freq[index] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}