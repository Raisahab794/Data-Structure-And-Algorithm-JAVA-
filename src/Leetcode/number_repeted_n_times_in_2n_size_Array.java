package Leetcode;
import java.util.*;
public class number_repeted_n_times_in_2n_size_Array {
    public int repetedNTimes(int[]nums){
        Set<Integer>s=new HashSet<>();
        for(int num:nums){
            if(!s.add(num)) {
                return num;
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[]args){
        number_repeted_n_times_in_2n_size_Array obj=new number_repeted_n_times_in_2n_size_Array();
        int[]nums={1,2,3,3};
        System.out.println(obj.repetedNTimes(nums));
    }
}
