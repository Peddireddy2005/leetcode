
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.get(num) > nums.length / 3 && !ans.contains(num)){
                ans.add(num);
            }
        }
        return ans;
    }
}
