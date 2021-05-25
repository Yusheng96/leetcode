package com.base;

public class exchangeJiou {
    public int[] exchange(int[] nums){//注意此处不能用private
        int left=0;int right=nums.length-1;
    int temp[]=new int[nums.length];
    for(int i=0;i< nums.length;i++)
    {
        if(nums[i]%2==0){
            temp[left++]=nums[i];
        }
        else
        {
            temp[right--]=nums[i];
        }
    }
        return temp;
    }
}
