class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftsum = 0;
        int rightsum = 0;
        int max = 0;
        for(int i = 0 ; i < k ; i++){
            leftsum += cardPoints[i];
            max = leftsum; 
        }
        while(leftsum != 0){
            leftsum -= cardPoints[k-1];
            k--;
            rightsum += cardPoints[n - 1];
            n--;
            max = Math.max(max, leftsum + rightsum);
        }
        return max;
    }
}