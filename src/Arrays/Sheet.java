package Arrays;
/**
 * 存储表
 */

import java.time.temporal.Temporal;
import java.util.Arrays;

public class Sheet {
    public static void main(String[] args) {
        Object[] emp1 = {1001,"李梦圆",18,"大学生","2006.6.66"};
        Object[] emp2 = {1002,"李梦圆",15,"高中生","2006.6.66"};
        Object[] emp3 = {1003,"李梦圆",25,"程序员","2006.6.66"};

        Object[][] emps = new Object[3][];
        emps[0] = emp1;
        emps[1] = emp2;
        emps[2] = emp3;
        for (Object[] temp:emps) {
            System.out.println(Arrays.toString(temp));
        }
    }
}
