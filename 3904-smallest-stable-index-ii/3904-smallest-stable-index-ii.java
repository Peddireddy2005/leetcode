class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int m = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            m = Math.max(m,nums[i]);
            left[i]=m;
        }
         int n = Integer.MAX_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            n = Math.min(n,nums[i]);
            right[i]=n;
        }
        for(int i=0;i<nums.length;i++){
            if(k>=left[i]-right[i]){
                return i;
            }
        }
        return -1;
    }
}