class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        int freq [] = new int [128];
        for (char c :s.toCharArray()){
            freq [c]++;
        }
        boolean odd = false;
        for (int c : freq){
            if(c % 2 == 0){
                count += c;
            }
            else {
                count += c - 1;
                odd = true;
            }
        }
        if(odd == true) count++;
        return count;
    }
}