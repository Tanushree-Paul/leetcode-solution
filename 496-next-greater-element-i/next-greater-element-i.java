class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> map = new HashMap <>();
        int j = 0;
        for(int i : nums2){
            map.put(i, j++);
        }
        int n = nums2.length;
        int temp [] = new int[n];
        Stack <Integer> stack = new Stack<>();
        for (int i = n-1; i >= 0 ; i--){
            while(!stack.isEmpty() && nums2[i] >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                temp[i] = -1;
            }
            else{
                temp[i] = stack.peek();
            }
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++){
            nums1[i] = temp[map.get(nums1[i])];
        }
        return nums1;
    }
}