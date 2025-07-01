class Solution {
    public String reverseWords(String s) {
       String[] sp = s.trim().split("\\s+");
       int i=0;
       int j=sp.length-1;
       while(i<j) 
       {
        String temp=sp[i];
        sp[i]=sp[j];
        sp[j]=temp;
        i++;
        j--;
       }
       return String.join(" ", sp);
    }
}