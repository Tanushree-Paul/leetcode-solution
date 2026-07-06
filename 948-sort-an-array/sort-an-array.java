class Solution {
    public int[] sortArray(int[] nums) {
        int [] arr = new int[nums.length];
        PriorityQueue <Integer> pq = new PriorityQueue <>();
        for(int i : nums){
            pq.offer(i);
        }
        int i = 0;
        while(!pq.isEmpty()){
            arr[i] = pq.poll();
            i++;
        }
        return arr;
    }
}