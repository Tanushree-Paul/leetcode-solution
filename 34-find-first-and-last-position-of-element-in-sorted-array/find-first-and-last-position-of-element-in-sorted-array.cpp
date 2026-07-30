class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int first = lower(nums, 0, nums.size() - 1, target);
        if(first == -1) return {-1, -1};
        int last = upper(nums, 0, nums.size() - 1, target);
        return {first, last};
    }
    int lower (vector <int> & nums, int low , int high , int x){
        int first = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return first;
    }
    int upper (vector <int> & nums, int low , int high , int x){
        int last = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == x){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return last;
    }
       
};