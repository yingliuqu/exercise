package IOStream;

import java.io.*;

/**
 * 1.图片 读取到字节数组中
 * 2.字节数组还原成文件 FileInputStream
 * 3.程序到字节数组 ByteArrayOutputStream
 */
public class IOtest09 {
    public static void main(String[] args) {
        //图片转成字节数组
        byte[] datas = FileToByteArray("D:/JavaWork/Exercise/src/IOStream/1.png");
        System.out.println(datas.length);

        byteArrayToFile(datas,"p-byte.png");
    }

    //图片读取到字节数组中
    public static byte[] FileToByteArray(String filePath){
        //1.创建源
        File src = new File(filePath);
        byte[] dest = null;
        //2.选择流
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            is = new FileInputStream(src);
            //3.操作(分段读取)
            byte[] flush = new byte[1024*10];//缓冲容器
            int len=-1;//接收长度
            while ((len=is.read(flush))!=-1){
                baos.write(flush,0,len); //写出到字节数组中
            }
            baos.flush();//刷新一下

            return baos.toByteArray();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    //字节数组写出到图片
    //1.字节数组到程序 ByteArrayInputStream
    //2.程序到文件 FileOutoutStream
    public static void byteArrayToFile(byte[] src,String filePath) {
        //1.创建源
        File dest = new File(filePath);
        //2.选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);
            //3.操作(分段读取)
            byte[] flush = new byte[5];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(flush)) != -1) {
                os.write(flush,0,len); //写出到文件
            }
            os.flush();//刷新一下0

        } catch (IOException e) {
            e.printStackTrace();
        }finally                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         {
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
