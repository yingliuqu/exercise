package IOStream;

import java.io.File;
import java.io.IOException;

/**
 * createNewFile() 创建文件
 *  delete() 删除文件
 */
public class TestFile03 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:/JavaWork/Exercise/src/io.txt");//绝对路径
        boolean flag = src.createNewFile();
        System.out.println(flag);
        src.delete();


        src = new File("D:/JavaWork/Exercise/io.txt");
        flag = src.createNewFile();
        System.out.println(flag);
        src.delete();


    }
}
