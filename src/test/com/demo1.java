package test.com;
    import java.util.*;

    public class demo1 {
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
            Set<Integer> set=new HashSet<Integer>();
            int cout=1;
            for(int x:arr){

                System.out.println(x);
            }

        }
    }

