package 常用类;

public class TestString {
    public static void main(String[] args) {
        String str = "aaaabbb";
        String str2 = str.substring(2,5);
        System.out.println(str);
        System.out.println(str2);




        //字符串比较要用equals方法
        System.out.println(str.equals(str2));
        String s1 = "hello"+" world";
        String s2 = "hello world";
        System.out.println(s1==s2);



    }
}
