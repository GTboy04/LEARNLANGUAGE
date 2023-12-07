package File_01;

import java.io.File;
import java.util.Arrays;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/17 7:29
 */
public class RecursionDeleteFile {
    public static void main(String[] args) {
        DeleteFile("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\test01");
    }

    public static void DeleteFile(String path){
        File f = new File(path);
        File[] files = f.listFiles();
        System.out.println(Arrays.toString(files));
        if (files != null){
            for (File file : files) {
                if (file.isDirectory()){
                    if (file.listFiles().length>0){
                        DeleteFile(file.getAbsolutePath());
                    }else {
                        System.out.println(file.getName()+"删除"+file.delete());
                    }
                }else {
                    System.out.println(file.getName()+"删除"+file.delete());
                }
            }


        }
        //里面的东西都删除完完了是不是就是要把自己删除了呢
        System.out.println(f.getName()+"删除"+f.delete());

    }

}
