package com.base;

import java.util.HashMap;
import java.util.Map;

public class Main {

//    public int[] twoSum(int nums[], int target) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[0];
//    }
public static void main(String[] args) {
    int num[]={0,1,2,3,4};
    for(int i=0;i<num.length-1;i++)
    {
        System.out.print(num[i]);
    }
    System.out.print("..");
}
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }


}