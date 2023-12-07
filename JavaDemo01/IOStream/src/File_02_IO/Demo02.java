package File_02_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author Gt_boy
 * @description: TODO OutputStream
 * @date 2023/11/20 22:13
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        FileOutputStream file = new FileOutputStream("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_02_IO\\test01.txt",true);
        byte[] bytes = "我是赵强他爸".getBytes();
        file.write(bytes);
        file.write("\r\n".getBytes());
        file.write("我是余柯他爸".getBytes());
        file.close();
    }
}
