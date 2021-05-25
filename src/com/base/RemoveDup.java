package com.base;
//删除数组中的重复元素
public class RemoveDup {
    public  int removeDuplicates(int[] nums) {
        int  fast=0,slow=0;
        while(fast<nums.length)
        {
            if(nums[fast]!=nums[slow])
            {
                slow++;
                nums[fast]=nums[slow];
            }
            fast++;
        }
        return slow+1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,4,5,6,6,7};

    }
}
