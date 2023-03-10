package IOStream;
/**
 * 使用面对对象 ： 统计文件夹大小
 */

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDirectory {

    public static void main(String[] args) {

        copy("D:/JavaWork/Exercise/src","D:/JavaWork1/Exercise1/src1");
    }
    public static void copy(String srcPath,String destPath) {
        //1.创建源
        File src = new File(srcPath);//源头
        File destination = new File(destPath);//目的地

        //2.选择流
        InputStream is = null;
        OutputStream os = null;
            //操作
        if (!destination.exists()){
            destination.mkdirs();
        }
        File[] files = src.listFiles();
        if (files==null||files.length==0){
            return;
        }
        for (File file :files){
            String movePath = destination+File.separator+file.getName();
           if (src.isDirectory()){
               copy(file.getAbsolutePath(),movePath);
           }




           //4.释放
            if(os==null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           if(is==null){
               try {
                   is.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

        }
    }
}

