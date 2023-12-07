package ThreadCreate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/25 16:17
 */
public class MyThread_test extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger("Tread");

    public MyThread_test(String name) {
        super(name);
    }

    public MyThread_test() {

    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            LOGGER.debug(thread+"i="+ i);
        }
    }

}
