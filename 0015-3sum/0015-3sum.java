class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> triplets = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++) {
            HashSet<Integer> set = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++) {
                int k = -(nums[i] + nums[j]);
                if(set.contains(k)) {
                    List<Integer> temp = Arrays.asList(nums[i], k, nums[j]);
                    Collections.sort(temp);
                    if(triplets.add(temp)) {
                        ans.add(temp);
                    }
                }
                set.add(nums[j]);
            }
        }
        return ans;
    }
}