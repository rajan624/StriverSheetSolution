class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low =0;
        int n= nums.length;
        int i=0 ,j=0;
        for( i =0;i<n;i++){
            for(j =i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    low =1;
                    break;
                }
            }
            if(low==1){
                break;
            }
        }
        int [] arr = {i,j};
        return arr;
    }
}