class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet <Integer> set = new HashSet <>();
        for (int i : nums){
            min = Math.min(i, min);
            max = Math.max(i, max);
            set.add(i);
        }
        for (int i = min+1; i < max; i++ ){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}