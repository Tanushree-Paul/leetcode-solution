class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m * k > bloomDay.length) return -1;
        
        int min = bloomDay[0];
        int max = bloomDay[0];
        for(int i = 1; i < bloomDay.length; i++){
            if(bloomDay[i] > max){
                max = bloomDay[i];
            }
            if(bloomDay[i] < min){
                min = bloomDay[i];
            }
        }
        int low = min;
        int high = max;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(func(mid, bloomDay, m, k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean func(int mid, int[] arr, int m, int k){
        int bouquet =0;
        int count = 0;
        for(int bloom : arr){
            if(bloom <= mid) count ++;
            else{
                bouquet += count/k;
                count = 0;
            }
        }
        bouquet += count / k;
        return bouquet >= m;
    }

    
}