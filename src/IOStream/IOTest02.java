package IOStream;

import java.io.*;

/**
 * 第一个IO程序 输出
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest02 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("D:/JavaWork/Exercise/src/IOStream/abc.txt");
        //2.选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //3.操作
            int temp;
            while ((temp=is.read())!=-1){
                System.out.println((char) temp);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            try {
                if (is!=null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
