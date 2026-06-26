class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // HashSet <Integer> set = new HashSet <>();
        // for (int i : nums){
        //     set.add(i); 
        // }
        // List<Integer> ans = new ArrayList<>();
        // for (int i = 1; i <= nums.length; i ++){
        //     if (!set.contains(i)){
        //         ans.add(i);
        //     }
        // }
        // return ans;
        for (int i = 0; i < nums.length; i++){
            int num = Math.abs(nums[i]); 
            // int index = num - 1;
            nums[num - 1] = -Math.abs(nums[num - 1]); 
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans.add(i + 1);
            }
        }
        return ans;
    }
}