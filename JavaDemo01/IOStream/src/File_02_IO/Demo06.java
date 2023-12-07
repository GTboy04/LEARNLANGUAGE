package File_02_IO;

import java.io.*;

/**
 * @author Gt_boy
 * @description: TODO compare capacity 比较两种方式的性能 1.低级数组；2.缓冲区数组
 * @date 2023/11/22 14:41
 */
public class Demo06 {
    public static void main(String[] args) {
        copy01();
        copy02();
    }

    public static void copy01(){
        long startTime = System.currentTimeMillis();
        try(
                FileInputStream fis = new FileInputStream("E:\\FZHgt\\Videos\\10月19日.mp4");
                FileOutputStream fos = new FileOutputStream("E:\\FZHgt\\Videos\\10月19日copy01.mp4");
                )
        {
            byte[] buffer = new byte[1024];
            int len;
            while ((len=fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("低级字节数组输出输入时间:"+(endTime-startTime)/1000.0);
    }


    public static void copy02(){
        long startTime = System.currentTimeMillis();
        try(
                FileInputStream fis = new FileInputStream("E:\\FZHgt\\Videos\\10月19日.mp4");
                FileOutputStream fos = new FileOutputStream("E:\\FZHgt\\Videos\\10月19日copy02.mp4");
                BufferedInputStream bfis = new BufferedInputStream(fis);
                BufferedOutputStream bfos = new BufferedOutputStream(fos);
        )
        {
            byte[] buffer = new byte[1024];
            int len;
            while ((len=bfis.read(buffer))!=-1){
                bfos.write(buffer,0,len);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("缓冲流字节数组输出输入时间:"+(endTime-startTime)/1000.0);
    }
}
