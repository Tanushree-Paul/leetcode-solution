class Solution {
    public String decodeString(String s) {
        Stack <Character> st = new Stack <> ();
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != ']'){
                st.push(ch);
            }
            else{
                StringBuilder temp = new StringBuilder();
                while(st.peek() != '['){
                    temp.append(st.pop());
                }
                temp.reverse();

                st.pop();

                StringBuilder num = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num.append(st.pop());
                }
                num.reverse();
                int k = Integer.parseInt(num.toString());

                String str = temp.toString();
                while(k > 0){
                    for(char c : str.toCharArray()){
                        st.push(c);
                    }
                    k--;
                }
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}