package File_04_data;

import org.apache.commons.io.FileUtils;

import java.io.*;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/22 16:42
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
//        func01();
//        Student student = new Student();
        FileUtils.copyFile(new File("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_04_data\\copy01.txt"),new File("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_04_data\\copy02.txt"));
    }

    /**
     * 数据字节输出流
     */
    public static void func01(){
        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_04_data\\test01.txt"));
                ){
            dos.write(97);
            dos.writeBoolean(true);
            dos.writeByte(1);
            dos.writeChar('a');
            dos.writeUTF("你好啊");
            dos.writeFloat(4.3F);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
