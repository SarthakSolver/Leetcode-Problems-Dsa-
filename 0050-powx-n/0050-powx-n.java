class Solution {
    public double myPow(double x, int n) {
        long N=n;
        return Pow(x,N);}
    private double Pow(double x, long n){
        
        if(n==0){
            return 1.0;
        }
        if(n>0){
            double half=Pow(x,n/2);
            double xp=half*half;
            if(n%2==0){
            
            return xp;}
            else{
                return x*xp;
            }
        }
        else{
            
            double xm=1.0/(Pow(x,-n));
            return xm;

        }
    }
}