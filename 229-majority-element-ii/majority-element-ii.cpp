class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int el1 = 0, count1 = 0;
        int el2 = 0, count2 = 0;
        for(int num : nums){
            if(num == el1) count1++;
            else if(num == el2) count2++;
            else if(count1 == 0){
                count1 = 1;
                el1 = num;
            }
            else if(count2 == 0){
                count2 = 1;
                el2 = num;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == el1) count1 ++;
            else if(num == el2) count2 ++;
        }
        vector <int> v;
        if(count1 > nums.size() / 3) v.push_back(el1);
        if(count2 > nums.size() / 3) v.push_back(el2);
        return v;
    }
};