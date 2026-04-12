class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> result = new ArrayList <Integer> ();
        HashSet <Integer> set = new HashSet <Integer> ();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            set.add(num);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        for (int i = min; i < max; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
