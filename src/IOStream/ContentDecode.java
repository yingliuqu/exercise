package IOStream;

import java.io.UnsupportedEncodingException;

/**
 * 解码 从字节到字符
 */
public class ContentDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命";
        //编码字符数组
        byte[] datas = msg.getBytes();
        System.out.println(datas.length);
        //解码
        msg = new String(datas,0,datas.length,"utf-8");
        System.out.println(msg);
        //乱码
        msg = new String(datas,0,datas.length-1,"utf-8");
        System.out.println(msg);
        //字符不统一
        msg = new String(datas,0,datas.length,"gbk");
        System.out.println(msg);
    }
}
