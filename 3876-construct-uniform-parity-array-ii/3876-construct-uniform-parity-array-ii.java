class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                even.add(nums1[i]);
            }
            else{
                odd.add(nums1[i]);
            }
        }
        if(even.size()==n || odd.size()==n){
            return true;
        }
        int min = odd.get(0);
        for(int i=0;i<odd.size();i++){
            min = Math.min(min,odd.get(i));
        }
        for(int i=0;i<even.size();i++){
            if(even.get(i)-min<1){
                return false;
            }
        }
        return true;
    }
}