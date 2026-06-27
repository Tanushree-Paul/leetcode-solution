class Solution {
    public List<List<Integer>> generate(int numRows) {
    //     List <List<Integer> > ans = new ArrayList <>();
    //     for (int i = 0; i < numRows; i++){
    //         List <Integer> row = new ArrayList <>();
    //         for (int j = 0 ; j <= i; j++){
    //             row.add(ncr(i, j));
    //         } 
    //         ans.add(row);
    //     }
    //     return ans; 
    // }
    // public int ncr (int n, int r){
    //     int prod = 1;
    //     for (int i = 0; i < r; i++){
    //         prod *= n-i; 
    //         prod /= i+1; 
    //     }
    //     return prod;
    List <List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < numRows; i++){
            List <Integer> rows = new ArrayList<>();
            long prod = 1;
            for(int j = 0; j <= i; j++){
                rows.add((int) prod);
                prod = prod * (i - j )/ (j + 1);  
            }
            ans.add(rows);
        }
        return ans;
    }
}