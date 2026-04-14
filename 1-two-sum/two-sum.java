class Solution {
    class Pair {
        int index, value;
        Pair (int value, int index){
            this.index = index;
            this.value = value;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        //store the value of the indices
        int n = nums.length;
        Pair[] arr = new Pair[n];
        for (int i = 0; i<n; i++){
            arr[i] = new Pair(nums[i], i);
        }
        //based on value 
        Arrays.sort(arr, (a,b) -> a.value - b.value);

        int left =0, right = n - 1;
        while (left<right){
            int sum = arr[left].value + arr[right].value;
            if(sum == target){
                return new int[] {arr[left].index, arr[right].index};
            }
            else if(sum < target) left++;
            else right--;
        }   
        /*HashMap <Integer, Integer> map = new HashMap <> ();
        for (int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }*/
        return new int[] {-1,-1};
    }
}