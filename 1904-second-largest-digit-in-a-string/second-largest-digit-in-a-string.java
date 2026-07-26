class Solution {
    public int secondHighest(String s) {
        int a = -1;
        int b = -1;
        // for(int i = 0; i < s.length(); i++){
        //     if(Character.isDigit(s.charAt(i))){
        //         int num = s.charAt(i) - '0';
        //         if(num > a){
        //             b = a;
        //             a = num;
        //         }
        //         else if(num > b && num != a){
        //             b = num;
        //         }
        //     }
        // }
        // return b;
        for(char ch : s.toCharArray()){
            if(ch < '0' || ch > '9') continue;
            int num = ch - '0';
            if(num > a){
                b = a;
                a = num;
            }
            else if(num > b && num != a){
                b = num;
            }
        }
        return b;
    }
}