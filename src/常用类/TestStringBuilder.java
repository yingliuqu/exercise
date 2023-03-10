package 常用类;

public class TestStringBuilder {
    public static void main(String[] args) {
        //StringBuilder类
//        StringBuilder sb = new StringBuilder("abcdefg");
//        System.out.println(sb);
//        sb.setCharAt(2,'Y');
//        System.out.println(sb.append(100));
        //append方法 在字符串后面加东西
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            char temp = (char)('a'+i);
            sb.append(temp);
        }
        System.out.println(sb);
        //insert 指定位置插入字符串
        sb.insert(3,"我").insert(4,"爱").insert(5,"你");
        System.out.println(sb);



    }
}
