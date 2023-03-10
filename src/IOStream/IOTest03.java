package IOStream;

import java.io.*;

/**
 * 分段读取 文件字节输入流 InputStream
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest03 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("D:/JavaWork/Exercise/src/IOStream/abc.txt");
        //2.选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //3.操作(分段读取)
            byte[] flush = new byte[1024];//缓冲容器
            int len=-1;//接收长度
            while ((len=is.read(flush))!=-1){
                //字节数组 --> 字符串（解码）
                String str = new String(flush,0,len);
                System.out.println(str);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
