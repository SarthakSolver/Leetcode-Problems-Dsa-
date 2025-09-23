class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int n=salary.length;
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
            if(salary[i]<min){
                min=salary[i];
            }
            if(salary[i]>max){
                max=salary[i];
            }
        }
        double avg=(sum-max-min)*1.0/(n-2);
        return avg;

    }
}