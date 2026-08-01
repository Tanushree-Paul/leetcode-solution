class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int ans = Integer.MAX_VALUE;
        int low = weights[0];
        int high = 0;
        for(int val : weights){
            low = Math.max(low, val);
            high += val;
        }
        

        while(low <= high){
            int mid = low + (high - low)/2;
            int val = func(mid, weights);
            if(val <= days){
                ans = Math.min(ans, mid);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public int func (int mid , int [] arr){
        int days = 1;
        int load = 0;
        for(int weight : arr){
            if(load + weight <= mid){
                load += weight;
            }
            else{
                days++;
                load = weight;
            }
        }
        return days;
    }
}