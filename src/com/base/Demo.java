package com.base;
import java.util.*;

public class Demo {
//    public String solve (String str) {
//        // write code here
//        int n=str.length();
//        for(int left=0,right=n-1;left<right;left++,right--){
//
//
//public int nodeNum(TreeNode head) {
//    return (int) (Math.pow(2,level(head))-1);
//}
//
//    public int level(TreeNode head){
//        if(head==null)
//            return 0;
//        return Math.max(level(head.left),level(head.right))+1;
//    }
//        }
//    }

public boolean hasCycle(ListNode head) {
    Set<ListNode> set=new HashSet<ListNode>();
    while(head!=null)
    {
        if(!set.add(head)){
            return true ;
        }
        head=head.next;
    }
    return false;
}
    public boolean isPail(ListNode head) {
        // write code here
        ListNode cur = head;
        List<Integer> list = new ArrayList<Integer>();
        while (cur.next != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(list.get(list.size() - i - 1))) {
                return true;
            }
        }
        return false;
    }

    public int myAtoi(String s) {
        char[] ch=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if(ch[i]==0||ch[i]==1||ch[i]==2||ch[i]==3||ch[i]==4||ch[i]==5||ch[i]==6||ch[i]==7||ch[i]==8||ch[i]==9){

                    sb.append(ch[i]);
            }
            else{
                break;
            }
        }
        return 0;
    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int len = 0;
//        String str = null;
//
//        str = scan.nextLine();
//        len = Integer.parseInt(str);
//
//        if (str.equals("")) {
//            System.out.println("");
//        } else {
//            System.out.println("12");
//        }
//    }
public static void main(String[] args) {
    int nums[]={1,0,-1,2,4};
    System.out.print(new threeSum().threeSum(nums));
}
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3)
            return res;

        Arrays.sort(nums); // O(nlogn)

        // O(n^2)
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // 在 i + 1 ... nums.length - 1 中查找相加等于 -nums[i] 的两个数
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                   // ArrayList<Integer> list=new ArrayList<>();
                    res.add((ArrayList)Arrays.asList(nums[i], nums[left], nums[right]));
                    // 去重
                    while (left < right && nums[left] == nums[++left]);
                    while (left < right && nums[right] == nums[--right]);
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}