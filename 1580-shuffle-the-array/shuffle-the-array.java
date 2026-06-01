class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int [2*n];
        int incr1 = 0;
        for (int i = 0 ; i < n; i++ ){
            ans[incr1] = nums[i] ;
            incr1 += 2;
        }
        int incr2 = 1;
        for (int i = n ; i < 2*n; i++ ){
            ans[incr2] = nums[i] ;
            incr2 += 2;
        }
        return ans;
    }
}