class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        rev (nums, 0, n - k - 1);
        rev (nums, n - k, n-1);
        rev (nums, 0, n-1);
        for(int i = 0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public int[] rev(int[] nums, int start, int end){
        while (start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}