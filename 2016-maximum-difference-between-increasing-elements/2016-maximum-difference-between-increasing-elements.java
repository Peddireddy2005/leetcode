class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (min < nums[i]) {
                int diff = nums[i] - min;
                maxDiff = Math.max(maxDiff, diff);
            }

            min = Math.min(min, nums[i]);
        }

        return maxDiff;
    }
}