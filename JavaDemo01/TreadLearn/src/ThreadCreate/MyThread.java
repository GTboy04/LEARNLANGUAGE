package ThreadCreate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/25 13:58
 */
public class MyThread extends Thread{

    private static final Logger LOGGER = LoggerFactory.getLogger("Tread");


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            LOGGER.debug("main子线程i="+ i);
        }
    }
}
