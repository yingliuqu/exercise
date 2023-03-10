package IOStream;

import java.io.File;

public class TestFile01 {
    public static void main(String[] args) {
        String path = "C:\\Users\\李梦圆\\Pictures\\Saved Pictures\\1.jfjf";
        System.out.println(System.getProperty("user.dir"));

        //绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());
        //相对路径
        src = new File("1.jfjf");
        System.out.println(src.getAbsolutePath());


        //1.构建File对象
        System.out.println(src.length());
        //2.构建File对象
        src = new File("C:/Users/李梦圆/Pictures/Saved Pictures","1.jfjf");
        src = new File("C:/Users/李梦圆/Pictures/Saved Pictures/1.jfjf");
        System.out.println(src.length());
        //3.构建File对象
        src = new File(new File("C:/Users/李梦圆/Pictures/Saved Pictures"),"1.jfjf");
        System.out.println(src.length());



        //文件分隔符File.separator 相当于 /
//        path = "C:/Users/李梦圆/Pictures/Saved Pictures/1.jfjf";
//        System.out.println(path);
//        path = "C:"+File.separator+"Users"+File.separator+"李梦圆"+File.separator+"Pictures"+File.separator+"Saved Pictures"+File.separator+"1.jfjf";
//        System.out.println(path);
    }
}
