class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     List<Character> list = new ArrayList<>();
    //     int max = 0;

    //     for (char c : s.toCharArray()) {

    //         while (list.contains(c)) {
    //             list.remove(0);
    //         }

    //         list.add(c);
    //         max = Math.max(max, list.size());
    //     }

    //     return max;
    // }


        // HashMap <Character, Integer> map = new HashMap <> ();
        // int max = 0;
        // int left = 0;
        
        // for (int right = 0; right < s.length(); right++){
        //     if (map.containsKey(s.charAt(right))){
        //         left = Math.max(left, map.get(s.charAt(right)) + 1);
        //     }
        //     map.put(s.charAt(right), right);
        //     int length = right - left + 1;
        //     max = Math.max(max, length);
        // }
        // return max;


        // int left = 0;
        // int right = 0;
        // int max = 0;
        // int freq [] = new int[256];
        // for(right = 0; right < s.length(); right++){
        //     while(freq[s.charAt(right)] == 1){
        //         freq[s.charAt(left)]--; 
        //         left++;
        //     }
        //     freq[s.charAt(right)]++;

        //     max = Math.max(max, right - left + 1);
        // }
        // return max;


        int left = 0;
        int right = 0;
        int hash [] = new int[256];
        int max = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            if(hash[ch] > 0){
                if(hash[ch] > left){
                    left = hash[ch];
                }
            }
            hash[ch] = right + 1; 
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}