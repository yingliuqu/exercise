package Exception;
/**
 * 使用throws声明异常
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Test3 {
    public static void main(String[] args) throws IOException {
        readMyFile();
    }

    public static void readMyFile() throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("D:/JavaWork/Exercise/b.txt");


            char c1 = (char)reader.read();
            System.out.println(c1);

        } finally {

            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}