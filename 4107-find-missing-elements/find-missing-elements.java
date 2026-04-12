class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List <Integer> result = new ArrayList <Integer> ();
        Arrays.sort(nums);
        for (int i = 1; i<nums.length; i++){
            int curr = nums[i-1];
            int next = nums[i];
            if((next - curr) > 1){
                for (int j = curr+1; j<next; j++){
                    result.add(j);
                }
            }
        }
        return result;
    }
}
