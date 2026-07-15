class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int n = pizzas.length;
        int days = n/4;

        int odd = (days + 1)/2;
        int even = days/2;

        long ans = 0;

        int i = n-1;

        //odd days
        while(odd-- > 0){
            ans += pizzas[i];
            i--;
        }

        //even days
        while(even-- >0){
            i--;
            ans += pizzas[i];
            i--;
        }
        return ans;
    }
}