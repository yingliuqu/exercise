package 常用类;

import javax.swing.*;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(season.SPRING);
        season a = season.AUTUMN;

        switch (a){
            case SPRING:
                System.out.println("春");
                break;
            case SUMMMER:
                System.out.println("↓");
                break;
            case AUTUMN:
                System.out.println("秋");
                break;
            case WINTER:
                System.out.println("冬");
                break;
        }
    }
}

enum season{
    SPRING,SUMMMER,AUTUMN,WINTER
}
enum week{
    星期一,星期二,星期三,星期四,星期五,星期六,星期日
}