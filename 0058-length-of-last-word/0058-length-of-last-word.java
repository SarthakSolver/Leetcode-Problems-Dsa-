class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.trim().split("\\s+");
        int n=arr.length;
        int len=arr[n-1].length();
        return len;
    }
}