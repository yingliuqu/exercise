package IOStream;

import java.io.*;

/**
 * 分段读取 字节数组输入流 ByteInputStream
 * 1.创建源 ：字节数组 byte[]  不要太大 容易内存爆
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest07 {
    public static void main(String[] args) {
        //1.创建源
        byte[] src = "talk is cheap show me the code".getBytes();
        //2.选择流
        ByteArrayInputStream is = null;
        try {
            is = new ByteArrayInputStream(src);
            //3.操作(分段读取)
            byte[] flush = new byte[5];//缓冲容器
            int len=-1;//接收长度
            while ((len=is.read(flush))!=-1){
                //字节数组 --> 字符串（解码）
                String str = new String(flush,0,len);
                System.out.println(str);
            }


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
