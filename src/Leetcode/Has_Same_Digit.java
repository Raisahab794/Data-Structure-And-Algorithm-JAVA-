package Leetcode;
import java.util.*;
public class Has_Same_Digit {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            int i=0;
            int j=i+1;
            StringBuilder sb=new StringBuilder();
            while(j<s.length()){
                int d=(s.charAt(i)-'0'+s.charAt(j)-'0')%10;
                sb.append(d);
                i++;
                j++;
            }
            s=sb.toString();
        }
        return s.charAt(0) == s.charAt(1);
    }
}
