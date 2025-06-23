class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        if(x<0){
            return false;
        }
        while (temp!=0){
            int r=temp%10;
            
            sum=sum*10+r;
            temp=temp/10;

        }
        if(sum==x){
            return true;
        }
        else{
            return false;
        }
    }
}