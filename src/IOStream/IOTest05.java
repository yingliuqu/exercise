package IOStream;

import java.io.*;

/**
 * 分段读取 字符数组输出流 Reader
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest05 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("D:/JavaWork/Exercise/src/IOStream/abc.txt");
        //2.选择流
        Reader reader = null;
        try {
            reader = new FileReader(src);
            //3.操作(分段读取)
            char[] c = new char[2];//缓冲容器
            int len=-1;//接收长度
            while ((len=reader.read(c))!=-1){
                //字节数组 --> 字符串（解码）
                String str = new String(c,0,len);
                System.out.println(str);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            try {
                if (reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
