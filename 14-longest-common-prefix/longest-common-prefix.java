class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        String ans = "";
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
        return ans; 
    }
}