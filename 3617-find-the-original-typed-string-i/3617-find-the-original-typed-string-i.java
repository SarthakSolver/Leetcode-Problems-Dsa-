class Solution {
    public int possibleStringCount(String word) {
        int len=word.length();
        int count=1;
        for(int i=1;i<len;i++){
            if(word.charAt(i-1)==word.charAt(i)){
                count++;
            }
        }
        return count;
        
    }
}