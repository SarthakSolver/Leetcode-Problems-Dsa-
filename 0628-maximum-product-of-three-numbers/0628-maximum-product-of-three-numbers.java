class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int nmax=0;
        int n=nums.length-1;
        max=nums[n]*nums[n-1]*nums[n-2];
        nmax=nums[0]*nums[1]*nums[n];
        max=Math.max(max,nmax);
        return max;

    }
}