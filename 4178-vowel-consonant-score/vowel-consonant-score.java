class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        for (char i : s.toCharArray()){
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u'){
                v++;
            }
            else if(Character.isLetter(i)){
                c++;
            }
        }
        if (c >0){
            return v/c;
        }
        else{
            return 0;
        }
    }
}