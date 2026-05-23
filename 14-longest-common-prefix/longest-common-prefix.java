class Solution {
    public String longestCommonPrefix(String[] strs) {
        //brute force
        String first = strs[0];
        /*String ans = "";
        for (int i = 1; i <= first.length(); i++){
            String prefix = first.substring(0,i);
            boolean flag = true;
            for (int j = 1; j < strs.length; j++){
                if (!strs[j].startsWith(prefix)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                ans = prefix;
            }
            else{ break;}
        }
        return ans; */

        //better 
        for (int i = 0; i < first.length(); i++){
            char ch = first.charAt(i);
            for (int j = 1; j < strs.length; j++){
                //mismatched indexed or out of bound
                if ( i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return first.substring (0, i);
                }
            }
        }
        return first;
    }
}