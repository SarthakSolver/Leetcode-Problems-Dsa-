class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            int goal=target-nums[i];
            if(map.containsKey(goal)){
                arr[0]=map.get(goal);
                arr[1]=i;
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}