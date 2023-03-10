package 常用类;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {
        //时间对象转换成相应格式的字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String s = df.format(new Date(400000000));
        System.out.println(s);

        //字符串转换成相应格式时间对象
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = df2.parse("2022-03-16 12:23:52");
        System.out.println(date);

        //测试其他格式的字符
        DateFormat df3 = new SimpleDateFormat("F");
        String s1 = df3.format(new Date());
        System.out.println(s1);
    }
}
