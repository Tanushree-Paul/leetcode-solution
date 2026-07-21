class Solution {
    int count = 0;
    public int reversePairs(int[] nums) {
        mergeSort(nums, 0 , nums.length - 1);
        return count;
    }
    private void mergeSort(int [] nums, int start, int end){
        if(start < end){
            int mid = start + (end - start)/2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);

            merge(nums , start, mid, end);
        }
    }
    private void merge(int [] nums, int start, int mid, int end){
        int j = mid + 1;
        for(int i = start; i <= mid; i++){
            while(j <= end && (long)nums[i] > 2L * nums[j]) j++;
            count += j - (mid + 1);
        }

        int i = start;
        j = mid + 1;
        List <Integer> list = new ArrayList<>();
        while(i <= mid && j <= end){
            if(nums[i] <= nums[j]){
                list.add(nums[i]);
                i++;
            }
            else{
                list.add(nums[j]);
                j++;
            }
        }
        while(i <= mid){
            list.add(nums[i]);
            i++;
        }
        while(j <= end){
            list.add(nums[j]);
            j++;
        }
        for(int k = start; k <= end; k++){
            nums[k] = list.get(k - start);
        }
    }
}