class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int max = 0;

        for (char c : s.toCharArray()) {

            while (list.contains(c)) {
                list.remove(0);
            }

            list.add(c);
            max = Math.max(max, list.size());
        }

        return max;
    }
}