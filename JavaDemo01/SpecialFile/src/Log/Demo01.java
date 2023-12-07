package Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/24 17:49
 */
public class Demo01 {
//    创建一个日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("Demo01");
    public static void main(String[] args) {
        try {
            LOGGER.info("---------------------");
            func1(10,2);

        }catch (Exception e){
            LOGGER.error("程序出现错误:"+e.getMessage());
        }
    }

    /**
     * 除法，除法会出现错误
     * @param a
     * @param b
     */
    private static void func1(int a,int b){
        LOGGER.debug("a:"+a+"   "+"b:"+b);
        double result = a/b;
        LOGGER.info("运算结果："+result);

    }

}
