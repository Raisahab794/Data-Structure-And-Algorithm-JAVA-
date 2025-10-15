package Leetcode;
import java.util.*;
public class ArrayAfterRemovingAnagram {
    class Solution {
        public boolean check(String s1,String s2){
            char[]c1=s1.toCharArray();
            char[]c2=s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }
        public List<String> removeAnagrams(String[] words) {
            List<String>ans=new ArrayList<>();
            ans.add(words[0]);
            for(int i=1;i<words.length;i++){
                if(!check(words[i],words[i-1]))ans.add(words[i]);
            }
            return ans;
        }
    }  
}
