class Solution {
    public int majorityElement(int[] nums) {
        /*HashMap <Integer, Integer> map = new HashMap <> ();
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
        return -1; */

        //moore voting's algo 
        int el = 0;
        int count = 0;
        for (int num: nums){
            if (count == 0){
                el = num;
            }
            if (num == el) count ++;
            else count --; 
        }
        return el;

        /*
        count = 0;
        for(int num : nums){
            if (num = el) count ++;
        }
        if (count > nums.length/2) return el;
        return -1;
        */
    }
}
