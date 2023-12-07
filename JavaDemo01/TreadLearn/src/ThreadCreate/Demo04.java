package ThreadCreate;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Gt_boy
 * @description: TODO 能返回结果的多线程 Callable接口与FutureTask类
 * @date 2023/11/25 15:00
 */
public class Demo04 {
    public static void main(String[] args) throws Exception {
        Callable<String> call = new MyCallable(100);
        FutureTask<String> f1 = new FutureTask<>(call);
        new Thread(f1).start();

        System.out.println(f1.get());
    }

}
