package IOStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 字符数组输入流 Writer
 * 1.创建源
 * 2.选择流
 * 3.操作(写内容)
 * 4.释放资源
 */
public class IOTest06 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("dest.txt");
        //2.选择流
        Writer writer = null;
        try {
            writer = new FileWriter(src,true);
            //3.操作

            //写法一
//            String msg = "IO 很容易\r\r";
//            char[] datas = msg.toCharArray();// 字符串-->字符数组
//            writer.write(datas,0,datas.length);
//            writer.flush();//刷新一下


            //写法二
//            String msg = "IO 很容易\r\r";
//            writer.write(msg);


            //写法三
            writer.append("IO 很容易").append("容易").append("哈哈哈");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放
            if (writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
