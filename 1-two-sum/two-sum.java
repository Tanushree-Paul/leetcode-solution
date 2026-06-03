class Solution {
    // class Pair{
    //     int index; 
    //     int value;
    //     Pair (int value, int index){
    //         this.value = value;
    //         this.index = index;
    //     }
    // }
    // public int[] twoSum(int[] nums, int target) {
    //     Pair [] arr = new Pair [nums.length];
    //     for (int i = 0; i < nums.length; i++){
    //         arr[i] = new Pair (nums[i], i);
    //     }
    //     Arrays.sort(arr, (a,b) -> a.value - b.value);
    //     int left = 0, right = nums.length - 1;
    //     while (left < right){
    //         int sum = arr[left].value + arr[right].value;
    //         if (sum == target){
    //             return new int [] {arr[left].index, arr[right].index};
    //         }
    //         else if(sum > target){
    //             right --;
    //         }
    //         else left++;
    //     }
    //     return new int [] {-1, -1};
    // 
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap <>();
        for (int i = 0; i < nums.length ; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int [] {i,map.get(complement)};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int [] {-1, -1};
    }

}