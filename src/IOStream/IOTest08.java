package IOStream;

import java.io.*;

/**
 * 字节数组输出流 ByteOutputStream
 * 1.创建源:内部维护
 * 2.选择流：不关联源
 * 3.操作(写内容)
 * 4.释放资源 ： 可以不用
 */
public class IOTest08{
    public static void main(String[] args) {
        //1.创建源
        byte[] dest = null;
        //2.选择流
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            //3.操作

            String msg = "talk is cheap show me the code";
            byte[] datas = msg.getBytes();//编码 字符串-->字节数组
            baos.write(datas,0,datas.length);
            baos.flush();//刷新一下

            //获取数据
            dest = baos.toByteArray();
            System.out.println(dest.length+"-->"+new String(dest));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放
            if (baos!=null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
