package IOStream;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * 对接输入输出流
 *
 * 释放资源的方法  使用jdk9 try...with...resource
 */
public class FileUtils {
    public static void main(String[] args) {
        //文件到文件
        try /*(is;os)   jdk9之后释放资源直接用这个*/{
            InputStream is = new FileInputStream("a.txt");
            OutputStream os = new FileOutputStream("a-copy.txt");
            copy(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //文件到字节数组
        byte[] flush = null;
        try {
            InputStream is = new FileInputStream("p-byte.png");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            copy(is,baos);
            flush = baos.toByteArray();
            System.out.println(flush.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //字节数组到文件
        try {
            //字节数组flush
            InputStream is = new ByteArrayInputStream(flush);

            OutputStream os = new FileOutputStream("p-copy.ong");
            copy(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void copy(InputStream is, OutputStream os) {
        try {
            //3.操作
            byte[] flush = new byte[1024];//缓冲容器
            int len=-1;//接收长度
            while ((len=is.read(flush))!=-1){
                os.write(flush,0,len);//分段读取
            }
            os.flush();//刷新一下
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放资源 分别关闭 先打开的后关闭 栈
            //close(is,os);
        }
    }
    public static void close(InputStream is,OutputStream os){
        if (os!=null){
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            if (null != is) {
                is.close();
            }
        }catch (IOException e) {
                e.printStackTrace();
        }
    }
    //重载 可以close多个
    public static void close(Closeable... ios){
        for (Closeable io:ios){
            try {
                if (null != io) {
                    io.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
