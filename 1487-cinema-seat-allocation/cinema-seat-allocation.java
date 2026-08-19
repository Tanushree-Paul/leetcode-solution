class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            map.put(row, map.getOrDefault(row, 0) | (1 << col));
        }

        int ans = 2 * n;
        int left = (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5);
        int middle = (1 << 4) | (1 << 5) | (1 << 6) | (1 << 7);
        int right = (1 << 6) | (1 << 7) | (1 << 8) | (1 << 9);

        for (int mask : map.values()) {
            ans -= 2;

            boolean leftAvailable = (mask & left) == 0;
            boolean middleAvailable = (mask & middle) == 0;
            boolean rightAvailable = (mask & right) == 0;

            if (leftAvailable && rightAvailable) {
                ans += 2;
            } 
            else if (leftAvailable || middleAvailable || rightAvailable) {
                ans += 1;
            }
        }

        return ans;
    }
}
