package ThreadCreate;

/**
 * @author Gt_boy
 * @description: TODO 方式二+匿名内部类的写法
 * @date 2023/11/25 14:33
 */
public class Demo03 {
    public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程1："+ i);
                }
            }
        };
        new Thread(target).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2："+i);
                }
            }
        }).start();

//        lambda匿名函数
        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程3："+i);
            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程："+i);
        }
    }
}
