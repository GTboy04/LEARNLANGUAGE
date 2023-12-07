package ThreadCreate;

/**
 * @author Gt_boy
 * @description: TODO 模拟线程安全 匿名内部内写法
 * @date 2023/11/25 16:41
 */
public class Demo06 {
    public static void main(String[] args) {
        Account comAccount = new Account(100000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                thread.setName("小明");
                comAccount.drawMoney(100000);
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                thread.setName("小红");
                comAccount.drawMoney(100000);
            }
        }).start();

    }
}
