class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        // int i = 0;

        // while (i < s.length()) {
        //     int j = i;

        //     while (j + 1 < s.length() && s.charAt(j + 1) == s.charAt(i)) {
        //     j++;
        // }

        // int len = j - i + 1;
        // return len;

        // i = j + 1;
        // }
        int totalOnes = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') totalOnes++;
        }
        String t = "1" + s + "1";
        List <Character> type = new ArrayList<>();
        List <Integer> length = new ArrayList <>();
        int i = 0;
        while (i < t.length()) {
            char ch = t.charAt(i);
            int count = 1;
            int j = i + 1;

            while (j < t.length() && t.charAt(j) == ch) {
                count++;
                j++;
            }
            type.add(ch);
            length.add(count);
            i = j;
        }
        
        int ans = totalOnes;
        for (int k = 1; k < type.size() - 1; k++) {
            if (type.get(k - 1) == '0' && type.get(k) == '1' && type.get(k + 1) == '0') { // Found a 0-1-0 pattern
                int gain = length.get(k - 1) + length.get(k + 1);
                ans = Math.max(ans, totalOnes + gain);
            }
        }
        return ans;
    }
}