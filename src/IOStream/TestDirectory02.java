package IOStream;

import java.io.File;

/**
 *
 * 列出下一级
 * 1.list()  列出下级名称
 * 2.listFiles()  列出下级File对象
 * 3.listRoots()  根目录 windows就是盘符
 *
 */

public class TestDirectory02 {
    public static void main(String[] args) {
        File dir = new File("D:/JavaWork/Exercise/src/IOStream");//绝对路径

        //列出下级名称 list
        String[] subNames = dir.list();
        for (String s:subNames
             ) {
            System.out.println(s);
        }

        //列出下级名称 list
        File[] subFiles = dir.listFiles();
        for (File f:subFiles
        ) {
            System.out.println(f);
        }
    }
}
