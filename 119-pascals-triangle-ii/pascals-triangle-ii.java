class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <Integer> list = new ArrayList <>();
        long prod = 1;
        for (int j = 0; j <= rowIndex; j++){
            list.add((int) prod);
            prod = prod * (rowIndex - j) / (j+1);
        }
        return list;
    }
}