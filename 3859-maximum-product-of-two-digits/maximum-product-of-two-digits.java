class Solution {
    public int maxProduct(int n) {
        int a = 0;
        int b = 0;
        while(n != 0){
            int last = n % 10;
            if(a == 0 && last > a){
                a = last;
            }
            else if(a != 0 && last > a){
                b = a;
                a = last;
            }
            else if(last > b){
                b = last;
            }
            n/= 10;
        }
        return a*b;
    }
}