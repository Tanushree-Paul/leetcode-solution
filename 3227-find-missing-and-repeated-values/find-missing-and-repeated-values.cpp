class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        // unordered_set <int> seen;
        // vector <int> ans;

        // int actualSum = 0;
        // int n = grid.size();
        // int total = n * n;
        // long long expectedSum = 1LL * total * (total + 1) / 2;

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         if (seen.count(grid[i][j])) ans.push_back(grid[i][j]);
        //         else seen.insert(grid[i][j]);
        //         actualSum += grid[i][j];
        //     }
        // }

        // ans.push_back(expectedSum + ans[0] - actualSum);
        // return ans;

        int n = grid.size();
        int total = n * n;

        int actualSum = 0;
        long long expectedSum = 1LL * total * (total + 1)/2;

        long actualSqSum = 0;
        long long expectedSqSum = 1LL * total * (total + 1) * (2*total + 1) / 6;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                actualSum += grid[i][j];
                actualSqSum += grid[i][j] * grid[i][j];
            }
        }

        int diff = actualSum - expectedSum;
        int sum = (actualSqSum - expectedSqSum) / diff;

        int x = (diff + sum) / 2;
        int y = sum - x;

        return {x,y}; 
    }
};