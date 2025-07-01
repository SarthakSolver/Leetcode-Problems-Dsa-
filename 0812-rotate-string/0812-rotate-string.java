import java.util.*;
class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length()) return false;
        String g=s+s;
        if(g.contains(goal))
        return true;
        else
        return false;
    }
}