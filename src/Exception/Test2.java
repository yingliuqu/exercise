package Exception;
/**
 * 使用try-catch声明异常
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
             reader = new FileReader("D:/JavaWork/Exercise/b.txt");
            System.out.println("step1");

            char c1 = (char)reader.read();
            System.out.println(c1);

        } catch (FileNotFoundException e) {//子类异常在父类异常前面
            System.out.println("step2");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("step3");
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
