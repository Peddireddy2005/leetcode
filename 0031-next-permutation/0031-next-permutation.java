
class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            rev(nums, 0, n-1);
            return;
        }

        for(int i=n-1; i>ind; i--){
            if(nums[ind] < nums[i]){
                swap(nums, ind, i);
                break;
            }
        }

        rev(nums, ind+1, n-1);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void rev(int[] nums, int left, int right){
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
