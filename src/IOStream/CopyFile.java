package IOStream;

import java.io.*;

/**
 * 文件拷贝： 文件字节输入，输出流
 */
public class CopyFile {
    public static void main(String[] args) {
        copy("D:/JavaWork/Exercise/src/IOStream/1.png","pcopy.png");
    }

    public static void copy(String srcPath,String destPath) {
        //1.创建源
        File src = new File(srcPath);//源头
        File destination = new File(destPath);//目的地

        //2.选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(destination);

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
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
