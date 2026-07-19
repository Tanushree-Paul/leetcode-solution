class Solution {
    public String smallestSubsequence(String s) {
        int freq [] = new int [26];
        for(char c : s.toCharArray()){
            freq [c - 'a']++;
        }
        boolean visited[] = new boolean[26];
        Stack <Character> stack = new Stack <>();
        for(char ch : s.toCharArray()){
            int a = ch - 'a';
            freq[a]--;
            if(visited[a]) continue;
            while(!stack.isEmpty() && stack.peek() > ch && freq[stack.peek() - 'a'] > 0){
                char removed = stack.pop();
                visited[removed - 'a'] = false;
            }
            stack.push(ch);
            visited[ch - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}