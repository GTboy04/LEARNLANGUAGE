package ThreadCreate;

/**
 * @author Gt_boy
 * @description: TODO
 * @date 2023/11/25 17:10
 */
public class MyThread_drawMoney extends Thread {
    private Account account;
    private int Money;

    public MyThread_drawMoney(Account account, String name, int Money) {
        super(name);
        this.account = account;
        this.Money = Money;
    }

    @Override
    public void run() {
        account.drawMoney(Money);
    }
}
