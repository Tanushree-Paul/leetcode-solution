class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = Integer.MAX_VALUE;
        int low = 1;

        int max = piles[0];
        for(int i = 1; i < piles.length; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }

        int high = max;

        while(low <= high){
            int mid = low + (high - low)/2;
            int val = func(mid, piles);
            if(val <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1; 
            }
        }
        return ans;
    }
    public int func(int mid, int [] piles){
        int ans = 0;
        for(int i = 0; i < piles.length; i++){
            ans += Math.ceil((double)piles[i] / mid);
        }
        return ans;
    }
}