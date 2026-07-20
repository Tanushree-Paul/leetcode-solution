class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int len = n * m;

        k = k % len;

        rev (grid, 0, len- k - 1, m);
        rev (grid, len - k, len -1, m);
        rev (grid, 0, len -1, m);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                row.add(grid[i][j]);
            }

            ans.add(row);
        }
        return ans;
    }
    public void rev(int [][]num, int i , int j, int col){
        while(i < j){
            int temp = num[i/col][i%col];
            num[i/col][i%col] = num[j/col][j%col];
            num[j/col][j%col] = temp;
            i++;
            j--;
        }
    }
}