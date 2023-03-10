package IOStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 文件字节输出流 OutputStream
 * 1.创建源
 * 2.选择流
 * 3.操作(写内容)
 * 4.释放资源
 */
public class IOTest04 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("dest.txt");
        //2.选择流
        OutputStream os = null;
        try {
            os = new FileOutputStream(src,true);
            //3.操作
            String msg = "IO is so easy\r\r";
            byte[] datas = msg.getBytes();//编码 字符串-->字节数组
            os.write(datas,0,datas.length);
            os.flush();//刷新一下


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
