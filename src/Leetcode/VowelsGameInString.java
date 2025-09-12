package Leetcode;
import java.util.*;
public class VowelsGameInString {
    public boolean isvowel(char ch){
        return "aioue".indexOf(ch)!=-1;
    }
    public boolean doesAliceWin(String s) {
        int count=0;
        for(char c:s.toCharArray()){
            if(isvowel(c))count++;
        }
        if(count==0)return false;
        else if(count%2==1)return true;
        else return true;
    }
}
