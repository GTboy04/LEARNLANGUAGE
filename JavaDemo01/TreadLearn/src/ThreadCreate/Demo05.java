package ThreadCreate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/25 16:15
 */
public class Demo05 {
    private static final Logger LOGGER = LoggerFactory.getLogger("Tread");
    public static void main(String[] args) {
        Thread t1 = new MyThread_test();
        t1.setName("1号线程");
        t1.start();
//        LOGGER.debug(t1.getName());

        Thread t2 = new MyThread_test();
        t2.setName("2号线程");
//        LOGGER.debug(t2.getName());
        t2.start();

//        Thread m = Thread.currentThread();
//        m.setName("主线程");
//        LOGGER.debug(m.getName());
    }

}
