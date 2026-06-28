class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // List <Integer> list = new ArrayList <> ();
        // char arrP [] = p.toCharArray();
        // Arrays.sort(arrP);
        // int length = arrP.length;
        // for (int i = 0 ; i <= s.length() - length; i++){
        //     String sub = s.substring(i, i + length);
        //     char arrSub [] = sub.toCharArray();
        //     Arrays.sort(arrSub);
        //     if(Arrays.equals(arrSub, arrP)){
        //         list.add(i);            
        //     }
        // }
        // return list;
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {
            return ans;
        }
        int countP [] = new int [26];
        for(char c : p.toCharArray()){
            countP[c - 'a']++;
        }
        int[] window = new int[26];
        int length = p.length();

        //first window
        for(int i = 0; i < length; i++){
            window[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(countP, window)) {
            ans.add(0);
        }

        // Slide the window
        for (int i = length; i < s.length(); i++) {
            // Add new character
            window[s.charAt(i) - 'a']++;

            // Remove old character
            window[s.charAt(i - length) - 'a']--;
            if (Arrays.equals(countP, window)) {
                ans.add(i - length + 1);
            }
        }
        return ans;
    }
}