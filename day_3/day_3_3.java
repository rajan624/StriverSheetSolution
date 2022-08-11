class Solution {
    public int majorityElement(int[] nums) {
        int max = 1;
        int add = nums[0];
        for(int i =0;i<nums.length;i++){
            if(add==nums[i]){
                max++;
            }else{
                max--;
            }
            if(max==0){
             add=   nums[i];
                max=1;
            }
        }
        return add;
    }
}