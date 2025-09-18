class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int n=numBottles;
        int k=numExchange;
        int total =n+(n-1)/(k-1);
        return total;
    }
}