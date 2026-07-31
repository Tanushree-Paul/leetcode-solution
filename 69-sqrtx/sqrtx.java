class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            long sq = (long) mid * mid;
            if(sq > x ){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                ans = Math.max(mid, ans);
            }
        }
        return ans;
    }
}