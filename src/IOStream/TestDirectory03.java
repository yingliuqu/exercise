package IOStream;
/**
 * 使用面对对象 ： 统计文件夹大小
 */

import java.io.File;

public class TestDirectory03 {
    //文件路径
    private String path;
    //文件源
    private File src;
    public TestDirectory03(String path){
        this.path = path;
        this.src = new File (path);
        count(this.src);
    }

    //长度
    private long len;
    //文件大小
    private int fileSize;
    //文件夹大小
    private int dirSize;
    //计数的地方
    public  void count (File src){
        if (null!=src&&src.exists()){
            if (src.isFile()){
                //是文件 fileSize加1
                len+=src.length();
                this.fileSize++;
            }else {//子孙级
                //是文件夹  dirSize加1
                this.dirSize++;
                for (File s:src.listFiles()) {
                    //listFiles列出下级文件
                    count(s);
                }
            }
        }
    }

    public long getLen() {
        return len;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int getDirSize() {
        return dirSize;
    }

    public static void main(String[] args) {
        TestDirectory03 Dir = new TestDirectory03("D:/JavaWork/Exercise/src");//绝对路径
        System.out.println(Dir.getLen());
        System.out.println(Dir.getDirSize());
        System.out.println(Dir.getFileSize());

    }



}
