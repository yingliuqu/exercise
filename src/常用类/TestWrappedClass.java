package 常用类;

public class TestWrappedClass {
    public static void main(String[] args) {
        //基本数据类型转成包装类对线
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(30);

        //把包装类对象转成基本数据类型
        int c = b.intValue();
        double d = b.doubleValue();

        //把字符串转成包装类对象
        Integer e = new Integer("9999");
        Integer f = Integer.parseInt("9999888");
//        String a1 = "55555555";
//        Integer.parseInt(a1,8);
//        System.out.println(a1);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
        //把包装类对象转成字符串
        String str = f.toString();
    }
}
