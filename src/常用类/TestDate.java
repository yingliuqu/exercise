package 常用类;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        Date date1 = new Date();
        //比较时间
        System.out.println(date.after(date1));
        System.out.println(date.before(date1));
    }
}
