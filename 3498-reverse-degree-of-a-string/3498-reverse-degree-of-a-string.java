class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int product = ('z'- c + 1)*(i+1);
            sum += product;
        }
        return sum;
    }
}