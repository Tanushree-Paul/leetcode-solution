class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet <Integer> set = new HashSet <> ();
        int n = grid.length;
        int actualSum = 0;
        int expectedSum = (n*n *(n*n + 1)) / 2;
        int a = -1, b = -1;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                actualSum += grid[i][j];
                int val = grid[i][j];
                if (set.contains(val)){
                    a = val;
                }
                set.add(val);
            }
        }
        b = expectedSum - actualSum + a;
        return new int[]{a,b};
    }
}