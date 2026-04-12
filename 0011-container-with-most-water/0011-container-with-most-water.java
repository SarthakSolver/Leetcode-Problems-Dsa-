class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxarea=0;
        while(i<j){
            int area=0;
            int min=Math.min(height[i],height[j]);
           
            area=min*(j-i);
            maxarea=Math.max(area,maxarea);
            if(height[i]<=height[j])
            i++;
            else
            j--;
        }
        return maxarea;
    }
    }
