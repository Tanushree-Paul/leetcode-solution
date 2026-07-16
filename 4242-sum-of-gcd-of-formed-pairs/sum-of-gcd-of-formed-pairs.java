class Solution {
    public long gcdSum(int[] nums) {
        int max = 0;
        int prefixGcd [] = new int [nums.length];
        for(int i = 0; i < nums.length; i ++){
            max = Math.max(nums[i], max);
            prefixGcd[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGcd); 
        int start = 0;
        int end = prefixGcd.length - 1;

        long sum = 0;
        while (start < end){
            sum += gcd(prefixGcd[start], prefixGcd[end]);
            start++;
            end--;
            if(start == end){
                break;
            }
        }
        return sum;
    }
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}