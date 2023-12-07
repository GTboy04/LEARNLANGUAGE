package ThreadCreate;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/25 17:10
 */
public class Demo07 {
    public static void main(String[] args) {
        Account account = new Account(100000);
        new MyThread_drawMoney(account,"小明",100000).start();
        new MyThread_drawMoney(account,"小红",100000).start();
    }
}
