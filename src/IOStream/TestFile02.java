package IOStream;

import java.io.File;

/**
 * 名称或路径
 * getName() 名称
 * getPath() 相对和绝对
 * getAvsolutePath() 绝对
 * getParent() 父路径
 * exists() 是否存在
 * isFile() 是否是文件
 * isDirectory() 是否是文件夹 目录
 * createNewFile() 创建文件
 * delete() 删除文件
 */
public class TestFile02 {
    public static void main(String[] args) {
        File src = new File("D:/JavaWork/Exercise/src/1.png");//绝对路径

        System.out.println(src.isFile());
        System.out.println(src.isDirectory());
        System.out.println(src.exists());
        System.out.println(src.length());

        src = new File("IOStream/1.png");//相对路径
        System.out.println(src.isFile());
        System.out.println(src.isDirectory());
        System.out.println(src.exists());

        src = new File("xxx");
        if (src==null || !src.exists()){
            System.out.println("文件不存在");
        }else if(src.isFile()){
            System.out.println("文件操作");
        }else {
            System.out.println("文件夹操作");

        }



        System.out.println("名称"+src.getName());
        System.out.println("路径"+src.getPath());
        System.out.println("绝对路径"+src.getAbsolutePath());
        System.out.println("父路径"+src.getParent());
//        System.out.println("父对象"+src.getParentFile().getName());

    }
}
