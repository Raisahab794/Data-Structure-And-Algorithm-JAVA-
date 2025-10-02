package Leetcode;
import java.util.*;
public class WaterBottle2 {
    public int maxBottlesDrunk(int B, int E) {
        int count=B;
        int emp=B;
        while(emp>=E){
            emp=emp-E;
            E++;
            emp++;
            count++;
        }
        return count;
    }
}
