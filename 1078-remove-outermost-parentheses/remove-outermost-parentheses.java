class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                if (count > 0)// indicating we are in inside valid parenthesis. 
                result.append("(");
                count ++;
            }
            if (s.charAt(i) == ')'){
                count --;
                if (count > 0) // indicating we are still inside valid parenthesis.
                result.append(")");
            }
        }
        return result.toString();
    }
}