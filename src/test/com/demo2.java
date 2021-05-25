package test.com;

import java.util.*;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a ;
        int[] arr=new int[n];
        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            arr[i]=a;
        }
        int big=0;
        int small=0;
        int res=0;
        for(int i = 0; i < n; i++){
            if(arr[i]>k) {
                big++;
            }
            else{
                small++;
            }

        }
        if(big>small)
        {

            res=big+small;
        }
        else{
            res=big+1;//5 8
            //  9 9 6 0 9
        }
        //System.out.println(big);
        //System.out.println(small);
        System.out.println(res);
    }
}
