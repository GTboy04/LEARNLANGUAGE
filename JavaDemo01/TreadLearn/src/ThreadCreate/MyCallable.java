package ThreadCreate;

import java.util.concurrent.Callable;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/25 15:01
 */
public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return "1-"+n+"的最终和结果为："+sum;
    }
}
