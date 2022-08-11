class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 0;
        int high = nums.length;
        int index =0;
        while(low<high){
            if(nums[index]!=nums[low])
                nums[++index]=nums[low];
                low++;
        }
        return ++index;
    }
}