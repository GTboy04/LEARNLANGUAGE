package ThreadCreate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gt_boy
 * @description: TODO 多线程的创建方式二
 * @date 2023/11/25 14:15
 */
public class Demo02 {
    private static final Logger LOGGER = LoggerFactory.getLogger("Tread");
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
//        执行任务类,创建一个线程对象调用start方法
        new Thread(myRunnable).start();

        for (int i = 0; i < 5; i++) {
            LOGGER.debug("主线程i="+i);
        }
    }
}
