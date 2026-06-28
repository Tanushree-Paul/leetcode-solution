class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int countRansom [] = new int[26];
        int countMaga [] = new int[26];
        for (char c : ransomNote.toCharArray()){
            countRansom[c - 'a']++;
        }
        for (char c : magazine.toCharArray()){
            countMaga[c - 'a']++;
        }
        for (int i = 0; i < 26; i++){
            if(countRansom [i] > countMaga[i]){
                return false;
            } 
        }
        return true;
    }
}