class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int ans = 0;
        int low = 1;
        int high = *max_element(piles.begin(), piles.end());

        while(low <= high){
            int mid = low + (high - low)/2;
            long long val = func(mid, piles);
            if(val <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    long long func(int mid, vector<int>& piles){
        long long ans = 0;
        for(int i : piles){
            ans += (1LL * i + mid - 1) / mid;
        }
        return ans;
    }
};
