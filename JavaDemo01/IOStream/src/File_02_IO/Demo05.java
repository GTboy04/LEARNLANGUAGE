package File_02_IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/21 20:42
 */
public class Demo05 {
    public static void main(String[] args) {
        try(
                FileWriter fw = new FileWriter("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_02_IO\\test(add).txt");

                ) {
            fw.write('a'); //字节
            fw.write("\r\n");
            fw.write("woqunima"); //字符串
            fw.write("\r\n");
            fw.write("woqunima",0,4);
            fw.write("\r\n");
            char[] chars = {'我','是','你','爸'};
            fw.write(chars,0,2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
