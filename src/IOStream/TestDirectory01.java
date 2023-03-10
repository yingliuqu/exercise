package IOStream;

import java.io.File;

/**
 *
 *  创建目录
 *  1.mkdir() 上级目录必须存在 若不存在则失败
 *  1.mkdirs() 上级目录不存在就自动创建一个
 *
 */

public class TestDirectory01 {
    public static void main(String[] args) {
        File src = new File("D:/JavaWork/Exercise/src/dir/io");//绝对路径
        boolean flag1;
        boolean flag;
        flag=src.mkdir();
        flag1=src.mkdirs();
        System.out.println(flag);
        System.out.println(flag1);
        src.delete();



    }
}
