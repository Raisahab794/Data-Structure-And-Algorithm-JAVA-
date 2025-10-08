package Leetcode;
import java.util.*;
public class SpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=potions.length;
        int[]ans=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int spell=spells[i];
            int left=0,right=n-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                long product=(long)spell*potions[mid];
                if(product>=success){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
            ans[i]=n-left;
        }
        return ans;
    }
}
