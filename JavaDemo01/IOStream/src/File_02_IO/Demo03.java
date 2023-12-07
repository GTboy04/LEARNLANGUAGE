package File_02_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Gt_boy
 * @description: TODO CopyFile
 * @date 2023/11/20 22:25
 */
public class Demo03 {
    public static void main(String[] args) {

        try(
                FileInputStream fis = new FileInputStream("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_02_IO\\test01.txt");
                FileOutputStream fos = new FileOutputStream("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_02_IO\\test01(copy).txt");
                )
        {
//            byte[] bytes = fis.readAllBytes();
//            fos.write(bytes);
            byte[] bytes = new byte[1024];
            int len = 0;
            if ((len = fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
            System.out.println("复制成功");
            System.out.println(Arrays.toString(bytes));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
