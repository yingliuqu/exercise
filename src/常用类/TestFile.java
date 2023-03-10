package 常用类;

import java.io.File;
import java.io.IOException;

/**
 * 测试File类的基本用法
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        //File f = new File("d:/a.txt");
        File f = new File("d:\\a.txt");
        System.out.println(f);//打印的是路径
        f.renameTo(new File("d:/bb.txt"));

        System.out.println(System.getProperty("user.dir"));//返回当前路径

        File f2 = new File("gg.txt");
        f2.createNewFile();
        f2.delete();
    }
}
