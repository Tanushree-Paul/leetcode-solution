class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> list = new ArrayList <> ();
        char arrP [] = p.toCharArray();
        Arrays.sort(arrP);
        int length = arrP.length;
        for (int i = 0 ; i <= s.length() - length; i++){
            String sub = s.substring(i, i + length);
            char arrSub [] = sub.toCharArray();
            Arrays.sort(arrSub);
            if(Arrays.equals(arrSub, arrP)){
                list.add(i);            
            }
        }
        return list;
    }
}