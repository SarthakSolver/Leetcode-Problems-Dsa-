class Solution {
    public void moveZeroes(int[] nums) {
        
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[zero]=nums[i];
                zero++;
            }
        }
        for(;zero<nums.length;zero++){
            nums[zero]=0;
        }
        
    }
}