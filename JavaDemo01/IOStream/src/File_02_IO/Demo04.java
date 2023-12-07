package File_02_IO;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Gt_boy
 * @description: TODO 字符流FileReader
 * @date 2023/11/21 20:30
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_02_IO\\test01.txt");
        FileInputStream fis = new FileInputStream("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_02_IO\\test01.txt");
//        System.out.println(fr.read());
//        System.out.println(fis.read()); 字节输入流的话会将拆分组成一个字符的字节，而字符输入流就不会，他是以一个字符为基准读的

        char[] chars = new char[3];
        int read = fr.read(chars);
        System.out.println(read);
        System.out.println(Arrays.toString(chars));
        fis.close();
//        System.out.println((char) fr.read());
        fr.close();
    }
}
