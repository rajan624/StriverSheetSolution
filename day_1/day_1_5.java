class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int high =  nums.length-1;
        for(int i =0;i<=high;i++){
            int temp;
            if(nums[i]==0){
                temp = nums[i];
                nums[i] = nums[low];
                nums[low] = temp;
                low++;
            }if(nums[i]==2){
                 temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                i--;
                high--;
            }
        }
    }
}