class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int idx = nums.length - 1;
        int multiplyCount = Math.min(k, mul - 1);
        for (int i = 0; i < k; i++) {
            if (i < multiplyCount) {
                ans += 1L * nums[idx] * (mul - i);
            } else {
                ans += nums[idx];
            }
            idx--;
        }
        return ans;

    }
}