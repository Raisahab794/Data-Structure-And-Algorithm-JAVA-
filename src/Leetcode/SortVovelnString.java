package Leetcode;
import java.util.*;
public class SortVovelnString {
    public boolean isvowel(char ch){
        return "AIOUEaioue".indexOf(ch)!=-1;
    }
    public String sortVowels(String s) {
        ArrayList<Character>v=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(isvowel(c))v.add(c);
        }
        Collections.sort(v);
        char[]str=s.toCharArray();
        int j=0;
        for(int i=0;i<str.length;i++){
            if(isvowel(str[i])){
                str[i]=v.get(j);
                j++;
            }
        }
        String ans=new String(str);
        return ans;
    }
}
