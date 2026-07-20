class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //better

        // List <List <Integer>> ans = new ArrayList<>();
        // for(int i = 0; i<nums.length; i++){
        //     HashSet <Integer> set = new HashSet <> ();
        //     for(int j = i + 1; j < nums.length; j++){
        //         int k = - (nums[i] + nums[j]);
        //         if(set.contains(k)){
        //             List <Integer> list = new ArrayList<> ();
        //             list.add(k);
        //             list.add(nums[i]);
        //             list.add(nums[j]);
        //             Collections.sort(list);

        //             if(!ans.contains(list)){
        //                 ans.add(list);
        //             }
        //         }
        //         set.add(nums[j]);
        //     }
        // }
        // return ans;

        //optimal

        Arrays.sort(nums);
        List <List<Integer>> ans = new ArrayList<> ();
        for (int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List <Integer> list = new ArrayList <> ();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;
                while(j < k && nums[j] == nums[j - 1]) j++;
                while(j < k && nums[k] == nums[k + 1]) k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }  
            }
        }
        return ans;
    }
}