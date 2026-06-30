class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) return n; 
        // return fib(n-1) + fib(n-2); 
        int f0 = 0, f1 = 1; 
        int res = 0;
        for(int i = 2; i<= n; i++){
            res = f0 + f1;
            f0 = f1;
            f1 = res;
        }
        return res;
    }
}