package ThreadCreate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/25 14:14
 */
public class MyRunnable implements Runnable{
    private static final Logger LOGGER = LoggerFactory.getLogger("Tread");
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            LOGGER.debug("子线程i="+i);
        }
    }
}
