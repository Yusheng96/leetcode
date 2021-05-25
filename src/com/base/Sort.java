package com.base;

import java.util.Scanner;

public class Sort {
    private static void quickSort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int []p=partiton(arr,l,r);
        }
    }
    private static int[]partiton(int arr[],int l,int r)
    {
        int less=1-r;
        int more=r;
        while(l<more){
            if(arr[l]<arr[r])
            {
               // swap(arr,l);
            }
        }
        return new int[]{less,more};
    }

    public static void main(String[] args) {
        int[] arr={3,2,6,3,9};
        Scanner input = new Scanner(System.in);
        String s  = input.nextLine();
        input.close();
        quickSort(arr,0, arr.length-1);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
