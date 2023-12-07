package File_01;

import java.io.File;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/16 22:02
 */
public class RecursionFileFind {
    public static void main(String[] args) {
        findFile("D:\\tools","QQ.exe");
    }

    public static void findFile(String path,String FindName){
        File f = new File(path);
        if (f == null||!f.exists()||f.isFile()){
            //表示不能进行搜索
            System.out.println("该路径不支持搜索");
            return;
        }

        File[] files = f.listFiles();
        if (files != null){
            for (File file : files) {
                if (file.isDirectory()){
                    findFile(file.getAbsolutePath(),"QQ.exe");
                }else {
                    if (file.getName().equals("QQ.exe")){
                        System.out.println("找到了："+file.getAbsolutePath());
                    }
                }
            }
        }
    }

}
