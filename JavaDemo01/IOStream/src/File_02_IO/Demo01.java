package File_02_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Gt_boy
 * @description: TODO   InputStream read()
 * @date 2023/11/20 21:37
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("F:\\CodeBase\\JAVA\\JavaDemo01\\IOStream\\src\\File_02_IO\\test.txt");
//        一次读一个字节
//        int i = file.read();
//        System.out.println((char) i);

//        利用循环多很多字节，但是效率低下
//        int read = 0;
//        while ((read= file.read())!=-1){
//            System.out.print((char) read);
//        }
//        file.close();

//        重载read-buffer利用字节数组读取多个字节
//        创建一个长度为3的字节数组
        byte[] bytes = new byte[3];
//        利用这个bytes读取字节,使用这个方法后返回的是读取数组的长度
        int len1 = file.read(bytes);
//        解码字节
        System.out.println(new String(bytes));
        System.out.println(len1);

//        读取第二次；文件里面的东西是（abc66），第一读取的时候里面就只有两个了，放字节会那当前读的妨碍之前的，如果现在的比数组长度短
//        那么一定要先定解码时的长度
        int len2 = file.read(bytes);
        System.out.println(new String(bytes, 0, len2));
        System.out.println(len2);
//        如果没有这样做的话，就会出现没有被替换的情况

//        释放资源
        file.close();
    }
}
