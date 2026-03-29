class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0.0;
        double maxsum;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxsum=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum/k;
    }
}