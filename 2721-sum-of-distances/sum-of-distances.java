class Solution {
    public long[] distance(int[] nums) {
        // brute force

        // long [] arr = new long [nums.length];
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = 0; j< nums.length; j++){
        //         if(nums[j] == nums[i]){
        //             sum += Math.abs(j - i);
        //         }
        //     }
        //     arr[i] = sum;
        // }
        // return arr;

        //optimal
        long [] ans = new long [nums.length];

        HashMap <Integer, Integer> freq = new HashMap <> ();
        HashMap <Integer, Long> index = new HashMap <> ();
        
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            if(freq.containsKey(n)){
                ans[i] += (long) i * freq.get(n) - index.get(n);
            }
            freq.put(n, freq.getOrDefault(n, 0) + 1);
            index.put(n, index.getOrDefault(n, 0L) + i);
        }
        freq.clear();
        index.clear();
        for(int i = nums.length - 1; i >= 0; i--){
            int n = nums[i];
            if(freq.containsKey(n)){
                ans[i] += index.get(n) - (long) i * freq.get(n);
            }
            freq.put(n, freq.getOrDefault(n, 0) + 1);
            index.put(n, index.getOrDefault(n, 0L) + i);
        }
        return ans;
    }
}