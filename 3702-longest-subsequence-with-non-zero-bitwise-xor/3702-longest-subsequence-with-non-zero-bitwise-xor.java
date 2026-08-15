class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int c = 0;
        for(int i=0;i<nums.length;i++){
            xor ^= nums[i];
            if(xor != 0){
                c=1;
            }
        }
        if(xor == 0 && c==0){
            return 0;
        }
        else if(xor == 0 && c==1){
            return nums.length-1;
        }
        else{
            return nums.length;
        }
    }
}