class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap <> ();
        int n = nums.length; 
        for (int i = 0; i < n; i++){
            int val = nums[i];
            if (map.containsKey(val)){
                map.put(val, map.get(val) + 1);
            }
            else {
                map.put(val, 1);
            }
            if(map.get(val) > n/2) return val;
        }
        return -1;
    }
}
