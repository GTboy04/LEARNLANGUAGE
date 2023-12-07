package File_03_Transform;

import java.io.*;
import java.nio.Buffer;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/22 15:18
 */
public class Demo01 {
    public static void main(String[] args) {
//        func01();
//        System.out.println("---------------");
//        func02();
        func03();
    }

    /**
     * 常规字符输入流
     */
    public static void func01(){
        try (
                FileReader fr = new FileReader("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_03_Transform\\GBKcontext.txt");
                BufferedReader bfr = new BufferedReader(fr);
                ){
            String len;
            while ((len=bfr.readLine())!=null){
                System.out.println(len);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 字符输入转换流
     */
    public static void func02(){

        try(
                InputStream fis = new FileInputStream("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_03_Transform\\GBKcontext.txt");
                Reader fisr = new InputStreamReader(fis,"GBK");
                BufferedReader bfisr = new BufferedReader(fisr);
                ){
            String len;
            while ((len=bfisr.readLine())!=null){
                System.out.println(len);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void func03(){
        try(
                OutputStream os = new FileOutputStream("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_03_Transform\\Write.txt");
                Writer osw = new OutputStreamWriter(os,"GBK");
                Writer bosw = new BufferedWriter(osw);
                ){
            bosw.write("我是赵强他爸");
            bosw.write("你有什么事情吗");
            bosw.write("I LOVE YOU");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
