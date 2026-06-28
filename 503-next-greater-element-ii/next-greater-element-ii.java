class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nge [] = new int [n];
        Stack <Integer> stack = new Stack<>();
        for(int i = (2*n) - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums[i % n] >= stack.peek()){
                stack.pop();
            }
            if(i < n){
                if(stack.isEmpty()){
                    nge[i] = -1;
                }
                else{
                    nge[i] = stack.peek();
                } 
            } 
            stack.push(nums[i % n]);
        }
        return nge;
    }
}