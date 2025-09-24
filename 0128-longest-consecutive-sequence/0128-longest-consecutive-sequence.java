class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int count=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int curnum=i;
                int streak=1;
                while(set.contains(curnum+1)){
                    curnum++;
                    streak++;

                }
                count=Math.max(count,streak);

            }
            
        }
        return count;
    }
}