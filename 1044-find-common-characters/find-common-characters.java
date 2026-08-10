class Solution {
    public List<String> commonChars(String[] words) {
        HashMap <Character, Integer> map = new HashMap <> ();
        for(char ch : words[0].toCharArray()){
            map.put(ch, map.getOrDefault(ch , 0) + 1);
        }

        for(int i = 1 ; i < words.length; i++){
            HashMap <Character, Integer> freq = new HashMap <> ();
            for(char ch: words[i].toCharArray()){
                freq.put(ch, freq.getOrDefault(ch , 0) + 1);
            }

            for(char ch : map.keySet()){
                if(freq.containsKey(ch)){
                    map.put(ch, Math.min(map.get(ch), freq.get(ch)));
                }
                else map.put(ch, 0);
            }
        }

        List <String> ans = new ArrayList <>();
        for(char ch : map.keySet()){
            int count = map.get(ch);
            while(count > 0){
                ans.add(String.valueOf(ch));
                count--;
            }
        }
        return ans;   
    }
}