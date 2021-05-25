package test.com;

public class StringIntern1 {
    public static void main(String[] args) {
//        String s3 = new String("1") + new String("1");//执行完后，常量池中不存在“11”
//        s3.intern();
//        String s4 = "11";//在字符串常量池中生成对象“11”
//         System.out.println(s3 == s4);//t
        ///——————————————————————————
        String s1 = new String("计算机");
        String s2 = s1.intern();
       // String s3 = "计算机";
        System.out.println(s2);//计算机
        System.out.println(s1 == s2);//false，因为一个是堆内存中的 String 对象一个是常量池中的 String 对象，
        //System.out.println(s3 == s2);//true，因为两个都是常量池中的 String 对象
    }
}
