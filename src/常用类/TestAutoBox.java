package 常用类;

public class TestAutoBox {
    public static void main(String[] args) {
        Integer a = 234;//自动装箱  系统自动转换成：Integer a = Integer.valueof(234);
        int b = a;//自动拆箱  编译器会自动修改成：int b = a.intValue();

        Integer c = null;
        int d = c;
    }
}
