class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for (int i = nums.length - 1; i > 0 ; i --){
            if(nums[i] > nums[i - 1]){
                pivot = i - 1;
                break;
            }
        }
        if(pivot == -1){
            reverse(nums, 0, nums.length -1);
            return;
        }
        int j = nums.length - 1;
        while (nums[j] <= nums[pivot]){
            j--;
        }
        swap (nums, pivot, j);
        reverse (nums, pivot + 1, nums.length -1);

    }
    public static void swap (int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp; 
    }
    public static void reverse (int [] arr, int left, int right){
        while(left <= right){
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}