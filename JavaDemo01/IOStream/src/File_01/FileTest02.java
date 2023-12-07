package File_01;

import java.io.File;
import java.io.IOException;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/16 20:08
 */
public class FileTest02 {
    public static void main(String[] args) throws IOException {
        //创建文件夹
        File f1 = new File("src//test");
        System.out.println(f1.mkdir());
        System.out.println(f1.exists());
        System.out.println(f1.delete());
        System.out.println("============");
        //创建文件
        File f2 = new File("src\\test.txt");
        System.out.println(f2.createNewFile());
        System.out.println(f2.exists());
        System.out.println(f2.delete());
        //创建多级文件夹
        File f3 = new File("src\\test01\\test02\\test03");
        System.out.println(f3.mkdirs());
        System.out.println(f3.exists());

    }
}
