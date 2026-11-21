
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int curr = 1;
        int longest = 1;
        int least = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == least) {
                continue;
            }
            else if(nums[i] - 1 == least) {
                curr++;
            }
            else {
                curr = 1;
            }
            least = nums[i];
            longest = Math.max(longest, curr);
        }
        return longest;
    }
}
