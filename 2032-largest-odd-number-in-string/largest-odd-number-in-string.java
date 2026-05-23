class Solution {
    public String largestOddNumber(String num) {
        /* String largest = "";
        for (int i = 0; i < num.length(); i++){
            for (int j = i + 1; j <= num.length(); j++){
                String large = num.substring (i, j);
                //to check if the last digit of 'large' is odd or not 
                char last = large.charAt(large.length() - 1);
                if ((last - '0') % 2 != 0){
                    //comparing string length first 
                    if (largest.length() < large.length()){
                        largest = large;
                    }
                    //if same length compare lexicographically
                    else if (largest.length() == large.length() && large.compareTo(largest) > 0){
                        largest = large;
                    }
                }
            }
        }
        return largest; */
        for (int i = num.length() - 1 ; i >= 0; i--){
            if((num.charAt(i) - '0') % 2 != 0){
                return num.substring (0, i + 1);
            }
        }
        return "";
    }
        
}
