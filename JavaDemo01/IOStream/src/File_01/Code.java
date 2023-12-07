package File_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/17 20:25
 */
public class Code {
    public static void main(String[] args) throws Exception {
        String test = "I love you == 我爱你";
        byte[] uft_8 = test.getBytes();
        System.out.println(Arrays.toString(uft_8));

        byte[] gbk_test = test.getBytes("GBK");
        System.out.println(Arrays.toString(gbk_test));
    }

}
