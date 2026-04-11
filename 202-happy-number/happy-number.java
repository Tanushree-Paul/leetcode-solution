class Solution {
    public boolean isHappy(int n) {
        /* for (int i = 0; i<200; i++){
            int sum = 0;
            while(n > 0){
                int lastdigit = n%10;
                sum = sum + lastdigit^2; 
                n = n/10;
            }
            if(sum == 1) return true;
            n = sum;
        }
        return false;    */
        HashSet <Integer> set = new HashSet<>();
        while (n != 1){
            if(set.contains(n)) return false;
            set.add(n);
            int sum = 0;
            while (n>0){
                int lastDigit = n%10;
                sum += lastDigit * lastDigit;
                n = n/10;
            }
            n = sum;
        }
        return true; 
    }
}