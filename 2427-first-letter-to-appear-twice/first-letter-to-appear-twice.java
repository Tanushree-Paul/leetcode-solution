class Solution {
    public char repeatedCharacter(String s) {
        int [] count = new int [26];
        char res = ' '; 
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            if(count[s.charAt(i) - 'a'] == 2){
                res = s.charAt(i);
                break;
            }
        } 
        return res;
    }
}