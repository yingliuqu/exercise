package 常用类;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendarwork {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入日期（格式为：2010-10-13）");

        //获取输入的时间
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();

        //创建时间对象
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");

        //将输入的字符串转换成时间对象
        Date date = df.parse(a);

        //将时间对象转换成日期对象
        Calendar c = new GregorianCalendar();
        c.setTime(date);

        //打印日历表头
        System.out.println("一\t二\t三\t四\t五\t六\t日");

        //将这一天存下来
        int theday =c.get(Calendar.DAY_OF_MONTH ) ;

        //将输入的这一天设为一号 这样可以从这月一号开始打印
        c.set(Calendar.DAY_OF_MONTH,1);
        //判断这一天是星期几
        //            （            星期六           ）
        for (int i=0;i<c.get(Calendar.DAY_OF_WEEK)-2;i++){
            System.out.print("\t");
        }

        //打印日历里面的日子
        int maxDay=c.getActualMaximum(Calendar.DATE);
        for (int i=1;i<=maxDay;i++){
            if (theday==c.get(Calendar.DAY_OF_MONTH)) {
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "*\t");
            }else{
                System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
            }
            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
                System.out.println();
            }
            c.add(Calendar.DAY_OF_MONTH,1);
        }
    }
}
