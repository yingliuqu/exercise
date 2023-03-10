package 常用类;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {

        Calendar c = new GregorianCalendar(2012,10,9,22,10,50);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int weekday=c.get(Calendar.DAY_OF_WEEK);//星期几
        int day=c.get(Calendar.DAY_OF_MONTH);//几号 也可用DATE
        System.out.println(year);
        System.out.println(month);
        System.out.println(weekday);
        System.out.println(day);

        //设置日期的元素
        c.set(Calendar.YEAR,9999);
        int year1=c.get(Calendar.YEAR);
        System.out.println(year1);

        //日期的计算
        c.add(Calendar.MONTH,5);
        int month1=c.get(Calendar.MONTH);
        System.out.println(month1);

        //日期对象转化时间对象
        Date d = c.getTime();
        //时间对象转化日期对象
        Calendar c1 = new GregorianCalendar();
        c1.setTime(new Date());

        printCalendar(c);

    }

    public static void printCalendar(Calendar c){
        //打印 1998年10月11日 11：23:45 周三
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int date=c.get(Calendar.DAY_OF_MONTH);
        int dayofweek=c.get(Calendar.DAY_OF_WEEK)-1;//周日是1 改成周一是1
        String dayweek2=dayofweek==0?"日":dayofweek+"";

        int hour=c.get(Calendar.HOUR);
        int minute=c.get(Calendar.MINUTE);
        int second=c.get(Calendar.SECOND);

        System.out.println(year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒    周"+dayofweek);
    }
}
