import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        String s1 = "abc ";
        String s2 = new String("def");
        String s3 = "abc"+"defgh";
        String s4 = "18"+19;
        System.out.println(s4);

        System.out.println("##################################");
        String s5 = "lmy";
        String s6 = "lmy";
        String s7 = new String("lmy");
        System.out.println(s5==s6);//true
        System.out.println(s6==s7);//false

        System.out.println("##################################");
        System.out.println(s1.charAt(3));//提取下标为三的字符
        System.out.println(s1.length());//字符串的长度

        System.out.println(s1.equals(s2));//判断两个字符串是否相等
        System.out.println(s1.equalsIgnoreCase(s2));//判断两个字符串是否相等 忽略大小写

        System.out.println(s1.indexOf("java"));//查找字符串s1中是否有"java"
        System.out.println(s1.indexOf("apple"));//查找字符串s1中是否有"apple"
        String s = s1.replace(' ','&');//新建s存放 将s1中的空格替换成&后的字符串
        System.out.println("result is :" + s);


        System.out.println("######################################");

        String b = "";
        String b1 = "How are you";
        System.out.println(b1.startsWith("How"));//是否以How开头
        System.out.println(b1.endsWith("you"));//是否以you结尾

        b = b1.substring(4);//提取子字符串，从下标4开始到结尾
        System.out.println(b);
        b= b1.substring(4,7);
        System.out.println(b);//提取子字符串，从下标4开始到下标7（不包括7）结束

        b = b1.toLowerCase();//转小写
        System.out.println(b);
        b = b1.toUpperCase();//转大写
        System.out.println(b);

        String b2 = "  How old are you!!  ";
        b=b2.trim();//去除收尾的空格，中间的空格不去除
        System.out.println(b);
    }
}
