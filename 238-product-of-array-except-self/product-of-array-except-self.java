class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] ans = new int[nums.length];
        // for (int i = 0; i < nums.length; i++){
        //     int product = 1;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i != j){
        //             product *= nums[j];
        //         }
        //     }
        //     ans[i] = product;
        // }
        // return ans;
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;

        for(int i = 1; i < n; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 2; i >= 0; i--){
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }
        return ans;
    }
}