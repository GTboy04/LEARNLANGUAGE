package ThreadCreate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gt_boy
 * @description: TODO 多线程的创建方式一
 * @date 2023/11/25 13:58
 */
public class Demo01 {
    private static final Logger LOGGER = LoggerFactory.getLogger("Tread");
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        调用start方法不要用run，如果用run的话那么还是单线程
        myThread.start();

        for (int i = 0; i < 5; i++) {
            LOGGER.debug("main主线程i="+ i);
        }
    }

}
