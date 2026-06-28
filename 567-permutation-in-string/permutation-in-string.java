class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();
        if (len > s2.length()) return false;
        int count1 [] = new int [26];
        for (char c : s1.toCharArray()){
            count1[c - 'a']++;
        }
        int window [] = new int [26];
        for (int i = 0; i < len; i++){  
            window[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(window, count1)) return true;
        for(int i = len; i < s2.length(); i++){
            window[s2.charAt(i) - 'a']++;
            window[s2.charAt(i - len) - 'a']--;
            if(Arrays.equals(window, count1)) return true;
        }
        return false;
    }
}