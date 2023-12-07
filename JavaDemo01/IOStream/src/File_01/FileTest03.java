package File_01;

import java.io.File;
import java.util.Arrays;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/16 20:33
 */
public class FileTest03 {
    public static void main(String[] args) {
        File f1 = new File("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\test01");
        System.out.println(Arrays.toString(f1.list()));

        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
//        System.out.println(Arrays.toString(files));
    }

}
