package Exam;

import java.math.*;

public class ExamUsually {
    public static void main(String[] args) {

        //各个进制
//        int a=15;
//        int b=015;
//        int c=0x115;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);


        //数据类型
//        long d =5555555555555555555L;
//        float e =5555555555000000000000000000000000000f;
//        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
//        String f="adsad";
//        char g='a';


        //位运算符
//        int a=3;
//        int b=4;
//        System.out.println(a&b);
//        System.out.println(a|b);
//        System.out.println(a^b);
//        System.out.println(~a);
//        System.out.println(12>>1);


        //强制类型转化
//        double x = 3.14 ;
//        int nx = (int) x;
//        System.out.println(nx);
//        char c ='a';
//        int d = c+1;
//        System.out.println(d);
//        System.out.println((char)d+1);


        //求圆的面积

//      double r = 10*Math.random();
//      double area = Math.PI*Math.pow(r,2);
//      double circle = 2*Math.PI*r;
//          System.out.println((int) area);
//          System.out.println((int)circle);
//          if (area>circle){
//               System.out.println("面积大");
//          }else {
//                System.out.println("周长大");
//          }


        //随机年龄分类
//        int age = (int)(100*Math.random());
//        if(age<15){
//            System.out.println("ertong");
//        }else if (age<25){
//            System.out.println("qingnian");
//        }else if(age<100){
//            System.out.println("laotou");
//        }


        //switch语句
//        int month =(int)(1+12*Math.random());
//        switch (month){
//            case 1:
//                System.out.println("一月");
//                break;
//            case 2:
//                System.out.println("二月");
//                break;
//            case 3:
//                System.out.println("三月");
//                break;
//            default:
//                System.out.println("其他");
//                break;
//        }


        //while循环计算1+2+3+...100的和
//        int a=1;
//        int sum=0;
//
//         while(a<=100){
//            sum+=a;
//            a++;
//        }
//        System.out.println(sum);


        //for循环例子一
//        int sum=0;
//        for(int i=0;i<=100;i++){
//            sum+=i;
//        }
//        System.out.println(sum);


        //for嵌套循环循环例子二(九九乘法表)
//        for(int i=1;i<=9;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+"*"+i+"=");
//                System.out.print(i*j+" ");
//            }
//            System.out.println();
//        }


           //嵌套循环分别计算奇数和偶数的和
//        int sum1 = 0;
//        int sum2 = 0;
//        for(int i=1;i<=100;i++){
//            if (i%2==0) {
//                sum1+=i;
//            }else {
//                sum2+=i;
//            }
//        }
//        System.out.println(sum1);
//        System.out.println(sum2);


        //嵌套循环计算1~1000能被5整除的数，每行输出五个
//        int sum=0;
//        for(int i=1;i<=1000;i++){
//            if(i%5==0){
//                System.out.print(i+" ");
//                sum++;
//            }
//             if(sum==5){
//                System.out.println();
//                sum=0;
//            }
//        }


        //打印出100以内不被3整除的数 （使用continue）
//        int sum = 0 ;
//        for (int i=1;i<=100;i++){
//            if (i%3==0){
//                continue;
//            }
//            System.out.print(i+" ");
//            sum++;
//            if (sum==5){
//                System.out.println();
//                sum=0;
//            }
//        }


        //打印100~150之间的质数 (用continue跳转)
//        outer:for(int i=100;i<=150;i++){
//            for (int j=2;j<i/2;j++){
//                if (i%j==0){
//                    continue outer;
//                }
//            }
//            System.out.print(i+" ");
//        }

        //打印100~150之间的质数
//        boolean flag = true;
//        for(int i=100;i<=150;i++){
//            for (int j=2;j<i/2;j++){
//               if(i%j==0){
//                   flag=false;
//               }
//            }
//            if (flag) {            //是质数打印出来
//                System.out.print(i + " ");
//            }
//            flag=true;


        //



    }
}
