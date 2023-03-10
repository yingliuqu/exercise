package IOStream;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * 编码 字符串 -> 字节
 */
public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "性命生命使命";
        //编码字符数组
        byte[] datas = msg.getBytes();
        System.out.println(datas.length);

        //编码：其他字符集
        datas = msg.getBytes("GBK");
        System.out.println(datas.length);



    }
}
