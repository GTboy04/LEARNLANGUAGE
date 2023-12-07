package File_01;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * @author Gt_boy
 * @description: TODO File常见方法
 * @date 2023/11/16 18:53
 */
public class FileTest01 {
    public static void main(String[] args) {
        File f1 = new File("Text.txt");//相对路径，注意观察自己的工作路径是什么

        //File.separator识别系统自动给出分隔符
        File f2 = new File("F:CodeBase"+File.separator+"JAVA"+File.separator+"JavaDemo01"+File.separator+"IOStream"+File.separator+"Text.txt");
        //创建对象能够指向空路径

        //常用方法
        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.length());
        SimpleDateFormat format = new SimpleDateFormat("yyyy/M/d -- HH:mm:ss");
        System.out.println(format.format(f1.lastModified()));
    }
}
