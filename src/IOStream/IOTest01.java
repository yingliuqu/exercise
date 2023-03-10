package IOStream;

import java.io.*;

/**
 * 第一个IO程序
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest01 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("D:/JavaWork/Exercise/src/IOStream/abc.txt");
        //2.选择流
        try {
            InputStream is = new FileInputStream(src);
            //3.操作
            int date1 = is.read();
            int date2 = is.read();
            int date3 = is.read();
            int date4 = is.read();
            System.out.println((char)date1);
            System.out.println((char)date2);
            System.out.println((char)date3);
            System.out.println((char)date4);

            //4.释放资源
            is.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
