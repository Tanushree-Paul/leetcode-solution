class Solution {
    public int[] findErrorNums(int[] nums) {
        // int n = nums.length;
        // int [] arr = new int[2];
        // HashSet <Integer> set = new HashSet<>();
        // for (int i : nums){
        //     if(set.contains(i)){
        //         arr[0] = i;
        //     }
        //     set.add(i);
        // }
        // for (int i = 1; i <= nums.length; i++){
        //     if(!set.contains(i)){
        //         arr[1] = i;
        //         break;
        //     }
        // }
        // return arr;
        int n = nums.length;
        int actualSum = 0;
        long actualSqSum = 0;
        for(int i : nums){
            actualSum += i;
            actualSqSum += (long) i*i;
        }

        int expectedSum = n * (n+1) /2;
        long expectedSqSum = (long) n * (n + 1) * (2*n + 1) / 6;

        int diff = actualSum - expectedSum;
        long sum = (actualSqSum - expectedSqSum) / diff;

        int x = (int) (diff + sum) / 2 ;
        int y = x - diff;

        return new int[] {x, y};
    }

}